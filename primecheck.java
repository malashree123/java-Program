import java.util.Scanner;
public class PrimeCheck {
  static public void main(String[]args) {
        Scanner number=new Scanner(System.in);
        int a = number.nextInt();
        boolean flag = false;
        for(int i = 2; i <= a/2; ++i)
        {
            if(a % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag){
            System.out.println(a + " is a prime number.");
                  }
        else{
            System.out.println(a + " is not a prime number.");
            }
   }
}
