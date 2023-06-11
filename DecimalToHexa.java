public class DecimalToHexa {
    static int convertToHexa(int decimal){
        if(decimal==0){
            return 0;
        }
        else{
            return decimal%16 + 10*(convertToHexa(decimal/16));
        }
    }
    public static void main(String[] args) {
        final int decimal = 25;
        System.out.print(convertToHexa(decimal));
    }
}
