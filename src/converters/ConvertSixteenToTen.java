package converters;

public class ConvertSixteenToTen implements ConvertStrategy {
    @Override
    public String Convert(String in) {
        int result = 0;
        StringBuilder reverse = new StringBuilder(in);
        reverse.reverse();

        for(int i = 0; i <= in.length() - 1; i++){
            switch (reverse.charAt(i)) {
                case '0': break;
                case '1': result += Math.pow(16, i);
                    break;
                case '2': result += Math.pow(16, i) * 2;
                    break;
                case '3': result += Math.pow(16, i) * 3;
                    break;
                case '4': result += Math.pow(16, i) * 4;
                    break;
                case '5': result += Math.pow(16, i) * 5;
                    break;
                case '6': result += Math.pow(16, i) * 6;
                    break;
                case '7': result += Math.pow(16, i) * 7;
                    break;
                case '8': result += Math.pow(16, i) * 8;
                    break;
                case '9': result += Math.pow(16, i) * 9;
                    break;
                case 'a': result += Math.pow(16, i) * 10;
                    break;
                case 'b': result += Math.pow(16, i) * 11;
                    break;
                case 'c': result += Math.pow(16, i) * 12;
                    break;
                case 'd': result += Math.pow(16, i) * 13;
                    break;
                case 'e': result += Math.pow(16, i) * 14;
                    break;
                case 'f': result += Math.pow(16, i) * 15;
                    break;
                default: System.out.println("Wrong input!!!");
                    return "0";
            }
        }

        return Integer.toString(result);
    }
}
