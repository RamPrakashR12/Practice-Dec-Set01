/* 
input - ab2b3
output - ababbb
*/
import java.util.*;

public class Question01 {
    static void repeatstring(String Str1){
        int charCount = Str1.length() - 1, index = 0, count = 0, maxCount = 0;
        String Str2 = "", Str3 = "", Str4 = "", Repeat = "";
    
        while(index <= charCount){
            int index1 = index;
            int index2 = index;
            //Character level looping
            while(Character.isLetter(Str1.charAt(index1)))
            {
                Str3 = Character.toString(Str1.charAt(index1));
                Str2 = Str2.concat(Str3);  
                index1++;
                if (index1 > charCount) break;
            }

            //Digit Level Looping
            while(Character.isDigit(Str1.charAt(index2)))
            {
                Str4 = Character.toString(Str1.charAt(index2));
                Repeat = Repeat.concat(Str4);
                maxCount = Integer.valueOf(Repeat); 
                index2++;
                if (index2 > charCount) break;
            }
            if (maxCount != 0 && Str2 != ""){
                count = 1;
                while(count <= maxCount){
                    System.out.print(Str2);
                    count++;
                }
                maxCount = 0;
                Str2 = "";
                Str4 = "";
                Repeat = "";
            }

            if (index1>(index+1)) index = index1;
            else if (index2>(index+1)) index = index2;
            else index++;
        }    
    }

    public static void main(String [] args){
        System.out.println("Provide the input string : ");
        Scanner S = new Scanner(System.in);
        String Str = S.nextLine();     
        repeatstring(Str);
        S.close();       
    }
}
