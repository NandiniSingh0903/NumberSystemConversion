public class HexaToBinary {
    static String hexToBinary(String hex){
        if(hex.isEmpty()){
            return "";
        }

        char hexDigit = hex.charAt(hex.length()-1);
        int dec = hexToDecimal(hexDigit);
        String bin = decimalToBinary(dec);

        String temp1 = hex.substring(0, hex.length()-1);
        String temp2 = hexToBinary(temp1);

        return temp2 + bin;
    }

    public static int hexToDecimal(char hexDigit){
        if(hexDigit>='0' && hexDigit<='9'){
            return hexDigit -'0';
        }

        else{
            return hexDigit - 'A' + 10;
        }
    }

    public static String decimalToBinary(int decimal){
        String bin = Integer.toBinaryString(decimal);

        while(bin.length()<4){
            bin = "0" + bin;
        }
        return bin;
    }

    
    public static void main(String[] args) {
        String hexNum = "A1F";
        // String binNum = hexToBinary(hexNum);
        // System.out.println(binNum);
        System.out.println(hexToBinary(hexNum));
    }
}
