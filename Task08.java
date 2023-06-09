import java.util.Scanner;
public class Task8{
  public static void main(String []args){
    Scanner input = new Scanner(System.in);
    int ar[] = new int[10];
    for(int i = 0 ; i < ar.length ; ){
      int x = input.nextInt();
      if(x>=0 && x<=9){
        ar[i] = x ;
        i++;
      }
    }
    
    String piyal = "" ;
    for(int i = 0 ; i < ar.length ; i++){
        int count = 0 ;
      for(int j = 0 ; j < ar.length ; j++){
        if(ar[i]==ar[j]){
          count++;
        }
      
      if(count>=2 && count<=5){
        piyal = piyal+ar[i]+" ";
      }
    }
    }
   Syetem.out.println("Output is" + " " + piyal);
  }
}
      
      
      