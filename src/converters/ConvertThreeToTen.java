package converters;

public class ConvertThreeToTen implements ConvertStrategy {
    @Override
    public String Convert(String in) {
        int result = 0;
        StringBuilder reverse = new StringBuilder(in);
        reverse.reverse();

        for(int i = 0; i <= in.length() - 1; i++){
            switch (reverse.charAt(i)) {
                case '0': break;
                case '1': result += Math.pow(3, i);
                    break;
                case '2': result += Math.pow(3, i) * 2;
                    break;
                default: System.out.println("Wrong input!!!");
                    return "0";
            }
        }

        return Integer.toString(result);
    }
}
