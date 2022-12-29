/*
find if string is substring of another string.. if yes return index of first occurrence
*/
import java.util.*;

public class Question04{
    public static void main(String [] args){
        Scanner S = new Scanner(System.in);
        System.out.println("Provide input string: ");
        String inp1 = S.nextLine();
        System.out.println("Provide sub-string: ");
        String inp2 = S.nextLine();     
        int len1 = inp1.length(), len2 = inp2.length(), index = 0, charCount = 0;
        for(int loop1=0;loop1<len1;loop1++){
            if(inp1.charAt(loop1)==inp2.charAt(0)){
                index = loop1;
                charCount = 0;
                for(int loop2=0,loop3=loop1;loop2<len2;loop2++,loop3++){
                    if(inp2.charAt(loop2)==inp1.charAt(loop3)){
                        charCount++;
                    }
                }
            }
            if(charCount==len2){
                System.out.println("Starting index of sub-string in given main string : " + index);
                break;
            }
        }
        S.close();
    }
}