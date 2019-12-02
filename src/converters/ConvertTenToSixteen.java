package converters;

public class ConvertTenToSixteen implements ConvertStrategy {
    @Override
    public String Convert(String in) {
        StringBuilder result = new StringBuilder();
        try{
            long input = Integer.parseInt(in);

            if (input == 0)
                return "0";
            while(input > 0) {
                if(input % 16 == 10)
                    result.append("a");
                else if(input % 16 == 11)
                    result.append("b");
                else if(input % 16 == 12)
                    result.append("c");
                else if(input % 16 == 13)
                    result.append("d");
                else if(input % 16 == 14)
                    result.append("e");
                else if(input % 16 == 15)
                    result.append("f");
                else
                    result.append(input % 16);
                input /= 16;
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
