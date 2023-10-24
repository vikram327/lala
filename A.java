package simple;
import java.util.Scanner;
public class A {

	public static void main(String[] args) {
		
		
          Scanner a=new Scanner(System.in);
          int boy=a.nextInt();
          int girl=a.nextInt();
          System.out.println(" ");
          
         
          if(boy >10 && girl<45) {
        	  System.out.println("you can enter");
        	  
        	 
          }
          
          
          else{
        	  System.out.println("you can not enter");
          }
          
        a.close();  
	}

}
