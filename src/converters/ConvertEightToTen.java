package converters;

public class ConvertEightToTen implements ConvertStrategy {
    @Override
    public String Convert(String in) {
        int result = 0;
        StringBuilder reverse = new StringBuilder(in);
        reverse.reverse();

        for(int i = 0; i <= in.length() - 1; i++){
            switch (reverse.charAt(i)) {
                case '0': break;
                case '1': result += Math.pow(8, i);
                          break;
                case '2': result += Math.pow(8, i) * 2;
                          break;
                case '3': result += Math.pow(8, i) * 3;
                          break;
                case '4': result += Math.pow(8, i) * 4;
                          break;
                case '5': result += Math.pow(8, i) * 5;
                          break;
                case '6': result += Math.pow(8, i) * 6;
                          break;
                case '7': result += Math.pow(8, i) * 7;
                          break;
                default: System.out.println("Wrong input!!!");
                         return "0";
            }
        }

        return Integer.toString(result);
    }
}
