/*
input(with odd number of characters) - 12345
output:
1      5
  2  4
    3
  2  4
1      5

*/
import java.util.*;

public class Question03 {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.println("Provide Input String: ");
        String inp = "";
        int len = 0, value1 = 0, value2=0;
        inp = S.nextLine();
        len = inp.length();
        value2 = len-1;
        System.out.println("Output:");
        for(int loop1=0;loop1<len;loop1++){
            for(int loop2=0;loop2<len;loop2++){
                if((value1==loop2) || (value2==loop2)){
                    System.out.print(inp.charAt(loop2));
                } else {
                    System.out.print(" ");
                }           
            }
            if(loop1<(len/2)){
                value1=value1+1;
                value2=value2-1;
            } else {
                value1=value1-1;
                value2=value2+1;
            }
            System.out.println("");
        }
        S.close();
    }
}
