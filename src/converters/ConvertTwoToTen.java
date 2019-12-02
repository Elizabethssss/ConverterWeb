package converters;

public class ConvertTwoToTen implements ConvertStrategy {

    @Override
    public String Convert(String in) {
        int result = 0;
        StringBuilder reverse = new StringBuilder(in);
        reverse.reverse();

        for(int i = 0; i <= in.length() - 1; i++){
            if(reverse.charAt(i) == '1')
                result += Math.pow(2, i);
            if(in.charAt(i) != '1' && in.charAt(i) != '0') {
                System.out.println("Wrong input!!!");
                return "0";
            }
        }

        return Integer.toString(result);
    }
}
