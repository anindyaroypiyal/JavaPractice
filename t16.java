import java.util.Scanner;
public class t16 {
  public static void main(String[] args){
  Scanner on = new Scanner(System.in);
  System.out.println("Enter number");
  int num = on.nextInt();
  double sum = 0;
  
  for (double i = 1; i <= num ; i++ ){
  
    sum = sum + (i/(2*i-1));
  }
  System.out.println("y="+sum);
  }

}