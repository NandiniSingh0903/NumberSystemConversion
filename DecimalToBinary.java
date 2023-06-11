public class DecimalToBinary{
    static int convertToBinary(int decimal){
        if(decimal==0){
            return 0;
        }
        else{
            return decimal%2 + 10*(convertToBinary(decimal/2));
        }
    }
    public static void main(String[] args) {
        final int decimal = 15;
        System.out.print(convertToBinary(decimal));
    }
}