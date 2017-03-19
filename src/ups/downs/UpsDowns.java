
package ups.downs;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;


public class UpsDowns {

   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      int n=5;
      System.out.println("Hello There ,");
      System.out.println("Welcome to my game");
      System.out.println("Choose a number thats up or down with respect to the number 5: \nif your answer is right you get 5 points or else you lose 2 or 4 points");
      System.out.println("The total turns in a single game is 6");
      System.out.println("D = down   U = up   E = equals");
      int sum=0;int i=0;int sel;
      while(true){
          System.out.println("type 1 to continue:");
      sel = sc.nextInt();
          
      switch (sel){
          case 1:
      for(int j=0;j<=5;j++)
      {
          int d = rand.nextInt(10)+1;
          System.out.println("**********************************************");
          System.out.println("D/U/E(Use Caps)");
          String ans = sc.next(); 
          System.out.println("**********************************************");
          if("D".equals(ans))
          {
              if(d>n)
              {
                  sum=sum-2;
                  System.out.println("the luck didn't favour you this time");
                  System.out.println("the number was: "+d);
              }
              else if(d<n)
              {
                  sum=sum+5;
                  System.out.println("lucky");
                  System.out.println("the number was: "+d);
              }
              else
              {
                  sum=sum-2;
                  System.out.println("the luck didn't favour you this time");
                  System.out.println("the number was: "+d);
              }
          }
          if("U".equals(ans))
          {
              if(d>n)
              {
                  sum=sum+5;
                  System.out.println("lucky");
                  System.out.println("the number was: "+d);
              }
              
              else if(d<n)
              {
                  sum=sum-2;
                  System.out.println("the luck didn't favour you this time");
                  System.out.println("the number was: "+d);
              }
              else
              {
                  sum=sum-2;
                  System.out.println("the luck didn't favour you this time");
                  System.out.println("the number was: "+d);
              }
          }
          if("E".equals(ans))
          {
              if(d==n)
              {
                  sum=sum+10;
                  System.out.println("woah you hit a jackpot");
                  System.out.println("the number was 5");
              }
              else if(d<n)
              {
                  sum=sum-5;
                  System.out.println("the luck didn't favour you this time");
                  System.out.println("the number was: "+d);
              }
              else
              {
                  sum=sum-5;
                  System.out.println("the luck didn't favour you this time");
                  System.out.println("the number was: "+d);
              }
          }
        
      }break;
      
      }break;
      }
        System.out.println("*************************************************");
      
        System.out.println("Total Score:"+sum);
      }
    
  }
