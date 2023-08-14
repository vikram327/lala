import java.util.Scanner;
  class Reversestring{
    public static void main (String[]args)
    {
        //using + (string concatenation)operator
        String str ="ABCD";
        String rev =" ";

        int len = str.length();  //4

        for(int i=len-1;i>=0;i--)   // 3 2 1 0 -1 false 
        {
           rev = rev + str.charAt(i); // D C B A 
        }         
       System.out.println("Reversed string is :"+ rev);
    }
}