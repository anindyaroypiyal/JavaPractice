import java.util.Scanner;
public class t22 {
  public static void main(String[] args){
    int sum = 0;
    int odd = 0;
    Scanner on = new Scanner(System.in);
    for (int a = 1;a <= 10 ; a++){
    System.out.println("enter number");
    int x = on.nextInt();
    if (a % 2 == 0) {}
    else {odd++;
          sum += a;}
    }  System.out.println("total is : "+sum);
        System.out.println("average is : "+(sum/odd));
   
    }
  }