public class DecimalToOctal {
    static int convertToOctal(int decimal){
        if(decimal==0){
            return 0;
        }
        else{
            return decimal%8 + 10*(convertToOctal(decimal/8));
        }
    }
    public static void main(String[] args) {
        final int decimal = 15;
        System.out.print(convertToOctal(decimal));
    }
}
