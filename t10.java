import java.util.Scanner;
public class t10 {
  public static void main(String[] args){
    Scanner on = new Scanner(System.in);
    System.out.println("enter your favourite car name");
    String c = on.nextLine();
     System.out.println("enter a number");
     int num = on.nextInt();
    for (int i =1 ; i <= num ; i++) {
    System.out.println(c);
   }
  }
}