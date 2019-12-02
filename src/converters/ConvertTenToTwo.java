package converters;

public class ConvertTenToTwo implements ConvertStrategy {
    @Override
    public String Convert(String in) {
        StringBuilder result = new StringBuilder();
        try{
            long input = Integer.parseInt(in);

            if (input == 0)
                return "0";
            while(input > 0) {
                result.append(input % 2);
                input /= 2;
            }
        }
        catch (Exception e){
            System.out.println("Wrong input!!!");
            return "0";
        }
        result.reverse();

        return result.toString();
    }
}
