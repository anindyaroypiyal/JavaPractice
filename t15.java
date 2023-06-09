import java.util.Scanner;
public class t15 {
  public static void main(String[] args){
  Scanner on = new Scanner(System.in);
  System.out.println("Enter last number");
  int num = on.nextInt();
  int sum = 0;
  
  for (int i = 1; i <= num ; i++ ){
  
    if (i%2 == 0) { sum = sum-(i*i); }
    else {sum = sum + (i * i); } 
    
  }
  System.out.println("y="+sum);
  }

}