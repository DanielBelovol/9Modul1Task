package Function.FunctionTask1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Start {
    public static void main(String[] args) {
        String names = "1. Ivan, 2. Danya, 3. Masha, 4. Alex, 5. Max, 6. Way, 7. Milky, 8. Bars, 9. Name, 1121. Mama";
        StringBuilder sb = new StringBuilder();

        Validator<String> validator = (nope) -> {
            try {
                String[] string = nope.split(", ");
                for(String oneName: string){
                    Pattern pattern = Pattern.compile("^\\d+");
                    Matcher matcher = pattern.matcher(oneName);

                    if (matcher.find()) {
                        int number = Integer.parseInt(matcher.group());
                        if (number % 2 == 1){
                            sb.append(oneName).append(", ");
                        }
                    }
                }
                System.out.println(sb.substring(0, sb.length() - 2));
            }catch (StringIndexOutOfBoundsException e){
                System.out.println("List of names is empty");
            }

        };

        validator.validation(names);
    }
}
