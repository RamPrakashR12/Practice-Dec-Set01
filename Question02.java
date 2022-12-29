/*
sort elements in odd pos in desc ord and elements on even pos in asc

input:  {10,20,17,5,9}
output: {17,5,10,20,9}
*/
public class Question02 {
    public static void main(String[] args){
        
        int numArray[] = {10,20,17,5,9};
        int n = numArray.length-1, temp = 0;
        int i=0, j=0, loop=0;
        //char ch = '\u0000';
        
        looplabel:
        for(;i<=n;)
        {  
            temp = numArray[i];
            j=i+2;
            for(;j<=n;j=j+2)
            {              
                System.out.println("loop:"+loop+"\t");
                if(loop == 0){
                    if(numArray[i]<numArray[j]){   
                        numArray[i] = numArray[j];
                        numArray[j] = temp;
                    }   
                }
                if(loop == 1){
                    if(numArray[i]>numArray[j]){   
                        numArray[i] = numArray[j];
                        numArray[j] = temp;
                    }
                }
            }
            if ((loop == 0) && (i+2 > n))
            {
                System.out.print("loop"+loop+"\n");
                i = 1;
                j = 0;
                loop = 1;
                continue looplabel; //Same "for loop" is re-used for the ascending scenario also
            }
            i=i+2;
        }    

        for (int ch:numArray)
            System.out.print(ch+"\t");
    }
}
