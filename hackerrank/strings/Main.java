import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/***

***/

class Result {
    public static int minimumNumber(int n, String password) {


        String[][] regex =  {
                {"[a-z]","minimum one low letter"},
                {"[A-Z]", "minimum one upper letter"},
                {"[0-9]", "minimum one number"},
                {"[!@#$%^&*()-+ ]", "minimum one special character"}
        };

        /*
            00 and 01
            10 and 11
            20 and 21
            30 and 31
         */


        String phrase = "";

        for(int i = 0; i < 4; i++){
            if(match(password, regex[i][0]).find()){
                phrase = phrase + "has " + regex[i][1] + "\n";
            }else{
                phrase = phrase + "is missing " + regex[i][1] + "\n";
            }
        }

       System.out.println("This password " + phrase );


        return 0;
    }

    public static Matcher match(String password, String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher;
    }
}


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner num = new Scanner(System.in);
        int n = num.nextInt();

        Scanner pass = new Scanner(System.in);
        String password = pass.nextLine();

        int answer = Result.minimumNumber(n, password);

        num.close();
        pass.close();
    }
}
