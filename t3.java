import java.util.Scanner;
public class t3 {
  public static void main(String[] args){
    Scanner on = new Scanner(System.in);
    for (int i =1 ; i <= 5 ; i++) {
    System.out.println("Enter number");
      int num = on.nextInt();
      if (num % 2 == 0) {System.out.println("even");}
      else {System.out.println("odd");}
    }
  }
}