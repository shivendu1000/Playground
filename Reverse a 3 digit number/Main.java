import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc= new Scanner(System.in);
    int n1 = sc.nextInt();
    int f,l,r,s;
    f = n1/100;
    s=((n1/10)%10);
    l=n1%10;
    r=(l*100)+(s*10)+f;
    System.out.println(r);
  
    
   
  }
}
    
    
    
      
  
