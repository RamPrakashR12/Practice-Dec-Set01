/*
reverse string
*/
import java.util.*;

public class Question07 {
    public static void main(String[] args) {
        System.out.println("Provide input string: ");
        Scanner S = new Scanner(System.in);
        String inp = S.nextLine();
        String StrArr[] = inp.split("",inp.length());
        
        Deque<String> queue = new ArrayDeque<String>();
        for(String Str:StrArr){
            queue.push(Str);
        }

        System.out.println("Output:");

        for(String Str:queue){
            System.out.print(Str);
        }
        
        //stk = push(inp.split.("",inp.length()));
    }
}
