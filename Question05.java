/*
merge 2 sorted arrays, without repeating elements 
*/
import java.util.*;

public class Question05{
    public static void main(String [] args){
        int arr1[] = {1, 7, 3, 9};
        int arr2[] = {5, 1, 9, 8, 3};

        //HashSet dont allow duplicates
        HashSet<String> set=new HashSet<String>();  

        for(int ch:arr1){
            set.add(Integer.toString(ch));
        }
        for(int ch:arr2){
            set.add(Integer.toString(ch));
        }

        System.out.println(set);
    }
}
