/*
reverse words in string as below,
input: i love india
output: india love i
*/
import java.util.*;

public class Question06 {
    public static void main(String[] args) {
        System.out.println("Provide input string: ");
        
        Scanner S = new Scanner(System.in);
        //String Output = "";
        String input = S.nextLine(); 
        String StrArr[] = input.split("\\s+",input.length()); 
        
        System.out.println("Output: ");
        for(int loop=StrArr.length-1;loop>=0;loop--){
            System.out.print(StrArr[loop]);
            System.out.print(" ");
        }

        S.close();
    }
}
