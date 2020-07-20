public class CheckPrimeComposite {
  static public void main(String[]args) {
       int a=Integer.parseInt(args[0]);
       int i=0;
       boolean flag = false;
       if(args.length==0){
             System.out.println("Please enter an int number");
        }
       else if(a==0||a==1){
             System.out.println(a+" is neither prime nor composite");
        }
       else{
             for(int c=1;c<=a/2;c++){
                  if(a%c==0){
                     flag=true;
                     break;
                    }
              }
             if (!flag){
            System.out.println(a + " is a prime number");
                  }
        else{
            System.out.println(a + " is not a prime number");
            }
        }
     }
}