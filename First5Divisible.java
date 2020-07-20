public class First5Divisible {
  static public void main(String[]args){
         int n=1;
         int count=0;
         while(count<5){
              if(n%2==0&&n%3==0&&n%5==0){
                if(count==4){
                   System.out.print(n);
                }
                else{
                   System.out.print(n+", ");
                }
                count++;
              }       
              n++;
         }
    }
}