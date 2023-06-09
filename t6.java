import java.util.Scanner;
public class t6 {
  public static void main(String[] args){
    Scanner on = new Scanner(System.in);
    int sum = 0;
    for (int i =1 ; i <= 20 ; i++) {
    System.out.println("Enter number");
      int num = on.nextInt();
      sum = sum + num;

    }System.out.println(sum/20);
  }
}