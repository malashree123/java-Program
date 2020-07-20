import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicateElement {
  static public void main(String[]args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter no. of elemnets in array");
      int a=scan.nextInt();
      int []arr=new int[a];
      System.out.println("Enter array elements");
      for(int i=0;i<a;i++){
          arr[i]=scan.nextInt();
      }
      for (int i = 0; i < a; i++) 
        {
            for (int j = i+1; j < a; j++)
            {
                if(arr[i] ==arr[j])
                {
                    arr[j] = arr[a-1];
                    a--;
                    j--;
                }
            }
        }
      int[] array1 = Arrays.copyOf(arr, a);
      System.out.print("\nArray with unique values : {");
         
        for (int i = 0; i < array1.length; i++){
        if(i==array1.length-1){
            System.out.print(array1[i]+"}"); 
            }
        else{
            System.out.print(array1[i]+", "); 
            }
        }
  }
}