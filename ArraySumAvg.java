public class ArraySumAvg {
  static public void main(String[]args) {
         int []arr =new int[]{10,20,30,40,50};
         int sum=0;
         float avg=0.0f;
         System.out.print("Initialized array is: {");
         for(int i=0;i<arr.length;i++){
             sum+=arr[i];
             if(i==arr.length-1){
                 System.out.print(arr[i] + "}");
             }
             else{
                 System.out.print(arr[i] + ", ");
             }
         } 
         System.out.println("\n");
         avg=(float)sum/arr.length;
          System.out.println("\nSum of the array is "+sum+" and average of the array is "+avg);
    }
}