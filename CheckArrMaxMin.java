public class CheckArrMaxMin {
  static public void main(String[]args) {
      int []myList={128,125,256,999,355};
      int myList_len=myList.length;
       System.out.print("Initialized array is: {");
         for(int j = 0; j < myList.length; j++){
             if(j==myList_len-1){
                   System.out.print(myList[j]+"}");
             }
             else{
                  System.out.print(myList[j] + ",");
             }
         }       
      int max = myList[0];
      int min = myList[0];
      for (int i = 1; i < myList.length; i++) {
         if (myList[i] > max) {
         max = myList[i];
         }
         else if (myList[i] < min) {
         min = myList[i];
         }
      }
      System.out.println("\nMax is " + max);
      System.out.println("Min is " + min);  
   }
}