import java.util.Scanner;
public class t20 {
  public static void main(String[] args){
    int sum = 0;
    Scanner on = new Scanner(System.in);
    System.out.println("enter number");
    int x = on.nextInt();
    
    for (int i =7 ;i <= x; i++ ){
      if  (i % 7 == 0) { sum += i;}
    } System.out.println(sum);
  }
}