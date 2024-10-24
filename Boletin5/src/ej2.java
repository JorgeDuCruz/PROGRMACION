public class ej2 {
    public static void main(String[]args){
        int sum=0;
        double producto=1;
        for( int i=10;i<=90;i++){
            sum = sum+i;
            producto = producto*i;
        }
        System.out.println("El producto de los numeros es "+producto+" y la suma es "+sum);
    }
}
