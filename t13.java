import java.util.Scanner;
public class t13 {
  public static void main(String[] args){
  Scanner on = new Scanner(System.in);
  System.out.println("enter number");
  int num = on.nextInt();
  int sum;
  int even;
  
  if (num % 2 == 0)
  
  { sum = num;
  even =1;}
  
  else {sum = 0;
   even = 0;}
  
  int min = num;
 
  for (int i = 1 ; i <= 6 ; i++) {
  System.out.println("enter number");
  int number = on.nextInt();
  if (number < min) {
    min = number;
  
    if (number%2==0);
    { sum = sum + number;
      even= even+1;
    }
  }
  else { if (number%2==0);
    { sum = sum + number;
     even=even+1;
    }
  }
  
  } System.out.println("average is " + (sum/even));
    System.out.println("Min is "+min);
 }
}