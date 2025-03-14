import Datas.Data;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
class DataTest {

    @Test
    @DisplayName("Iguales")
    void testEquals1() {
        Data d1= new Data(24,3,2015);
        Data d2= new Data(24,3,2015);
        assertTrue(d1.equals(d2));
    }
    @Test
    @DisplayName("falla dia")
    void testEquals2() {
        Data d1= new Data(2,3,2015);
        Data d2= new Data(24,3,2015);
        assertFalse(d1.equals(d2));
    }
    @Test
    @DisplayName("falla mes")
    void testEquals3() {
        Data d1= new Data(24,4,2015);
        Data d2= new Data(24,3,2015);
        assertFalse(d1.equals(d2));
    }
    @Test
    @DisplayName("falla año")
    void testEquals4() {
        Data d1= new Data(24,3,2016);
        Data d2= new Data(24,3,2015);
        assertFalse(d1.equals(d2));
    }
    @Test
    @DisplayName("falla dia,año")
    void testEquals5() {
        Data d1= new Data(2,3,2016);
        Data d2= new Data(24,3,2015);
        assertFalse(d1.equals(d2));
    }
    @Test
    @DisplayName("falla mes,año")
    void testEquals6() {
        Data d1= new Data(24,5,2016);
        Data d2= new Data(24,3,2015);
        assertFalse(d1.equals(d2));
    }
    @Test
    @DisplayName("falla dia, mes")
    void testEquals7() {
        Data d1= new Data(2,5,2015);
        Data d2= new Data(24,3,2015);
        assertFalse(d1.equals(d2));
    }


    @Test
    @DisplayName("Incrementar uno base")
    void incrementarDia() {
        Data d1 = new Data(1,5,2015);
        assertEquals("2/5/2015",d1.incrementarDia(1));
    }
    @Test
    @DisplayName("Incrementar uno al borde de limite")
    void incrementarDia1() {
        Data d1 = new Data(30,6,2015);
        assertEquals("1/7/2015",d1.incrementarDia(1));
    }
    @Test
    @DisplayName("Incrementar uno en año bisiesto")
    void incrementarDia2() {
        Data d1 = new Data(28,2,2016);
        assertEquals("29/2/2016",d1.incrementarDia(1));
    }
    @Test
    @DisplayName("Incrementar uno limite en año bisiesto")
    void incrementarDia3() {
        Data d1 = new Data(29,2,2016);
        assertEquals("1/3/2016",d1.incrementarDia(1));
    }
    @Test
    @DisplayName("Incrementar mas de un dia")
    void incrementarDia4() {
        Data d1 = new Data(1,5,2015);
        assertEquals("5/5/2015",d1.incrementarDia(4));
    }
    @Test
    @DisplayName("Incrementar mas de un dia en limite")
    void incrementarDia5() {
        Data d1 = new Data(28,5,2015);
        assertEquals("1/6/2015",d1.incrementarDia(4));
    }
    @Test
    @DisplayName("Incrementar un mes en dias")
    void incrementarDia6() {
        Data d1 = new Data(30,5,2015);
        assertEquals("30/6/2015",d1.incrementarDia(31));
    }
    @Test
    @DisplayName("Incrementar mas de un mes")
    void incrementarDia7() {
        Data d1 = new Data(1,5,2015);
        assertEquals("1/7/2015",d1.incrementarDia(61));
    }
    @Test
    @DisplayName("Incrementar mucho mas de un mes")
    void incrementarDia8() {
        Data d1 = new Data(1,5,2015);
        assertEquals("1/8/2015",d1.incrementarDia(92));
    }
    @Test
    @DisplayName("Incrementar un año")
    void incrementarDia9() {
        Data d1 = new Data(1,5,2014);
        assertEquals("1/5/2015",d1.incrementarDia(365));
    }

    @ParameterizedTest(name = "{0}/{1}/{2} +{3} --> {4}")
    @CsvSource({
            "1,5,2015, 1, 2/5/2015 ",
            "30,6,2015, 1, 1/7/2015",
            "28,2,2016, 1, 29/2/2016",
            "29,2,2016, 1, 1/3/2016",
            "1,5,2015, 4, 5/5/2015",
            "28,5,2015, 4, 1/6/2015",
            "30,5,2015, 31, 30/6/2015",
            "1,5,2015, 61, 1/7/2015",
            "1,5,2015, 92, 1/8/2015",
            "1,5,2014, 365, 1/5/2015"
    })
    void add(int dia, int mes, int anho, int dias, String resultadoEsperado){
        Data d1 = new Data(dia,mes,anho);
        assertEquals(resultadoEsperado,d1.incrementarDia(dias));
    }

    @ParameterizedTest(name = "Datas con formato dd/mm/aaaa")
    @CsvSource({
            "01/05/2015, 1, 2/5/2015 ",
            "30/06/2015, 1, 1/7/2015",
            "28/02/2016, 1, 29/2/2016",
            "29/02/2016, 1, 1/3/2016",
            "01/05/2015, 4, 5/5/2015",
            "28/05/2015, 4, 1/6/2015",
            "30/05/2015, 31, 30/6/2015",
            "01/05/2015, 61, 1/7/2015",
            "01/05/2015, 92, 1/8/2015",
            "01/05/2014, 365, 1/5/2015"
    })
    void cadena(String data, int dias, String resultadoEsperado){
        Data d1 = new Data(data);
        assertEquals(resultadoEsperado,d1.incrementarDia(dias));
    }
    //Hacer un test incrementando 0 dias y incrementar dias negativos.
    //Seguir probandando el constructor de String
}