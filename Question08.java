/*
find duplicates in array
*/
import java.util.*;

public class Question08{
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in array:");
        Scanner S = new Scanner(System.in);
        int len = S.nextInt();
        System.out.println("Provide elements of the array:");
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> duplicatelist = new ArrayList<String>();
        String Str = "";
        for(int loop1=0;loop1<=len;loop1++){
            Str = S.nextLine();
            if(list.contains(Str)){
                duplicatelist.add(Str);
            }
            list.add(Str);
        }
        System.out.println("Duplicate elements of array are :" + duplicatelist);
        S.close();
    }
}