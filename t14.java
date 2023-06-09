import java.util.Scanner;
public class t14 {
  public static void main(String[] args){
  Scanner on = new Scanner(System.in);
  System.out.println("Enter last number");
  int num = on.nextInt();
  int sum = 0;
  
  for (int i = 1; i <= num ; i++ ){
  
    sum= sum + (i*i*i);
  }
  System.out.println("y^3="+sum);
  }

}