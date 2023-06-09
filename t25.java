import java.util.Scanner;
public class t25 {
  public static void main(String[] args){
  Scanner on = new Scanner(System.in);
  for(int a = 1; a<= (num))
  System.out.println("enter number");
  int num = on.nextInt();
  int max = num;
  int sum = num;
  for (int i = 1 ; i <= 6 ; i++) {
  System.out.println("enter number");
  int number = on.nextInt();
  if (number > max) {
    max = number;
    sum= sum+number;}
  else {sum = sum + number;}
  } System.out.println("average is " + (sum/7));
    System.out.println("Max is "+max);
 }
}