public class BinaryToDecimal {
    static int convertToDecimal(int binary, int i){
        if(binary==0 || binary==1){
            return (int)Math.pow(2,i)*binary;
        }

        int lastDigit = binary%10;
        return (int)(Math.pow(2,i) * lastDigit) + convertToDecimal(binary/10, ++i);
    }
    public static void main(String[] args) {
        final int binary = 1111;
        System.out.println(convertToDecimal(binary, 0));
    }
}