public class CheckPrimeInRange {
  static public void main(String[]args){
       for(int a=10;a<=99;a++){
          boolean flag=false;
          for(int i=2;i<=a/2;i++){
             if(a%i==0){
                flag=true;
                break;
                }
             }
          if(flag==false){
             System.out.println(a);
             }
          }
      }
} 