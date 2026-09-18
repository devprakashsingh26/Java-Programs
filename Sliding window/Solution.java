import java.util.*;
public class Solution {
    
    public static int []  rotateleft( int d, int[] arr){
        int n = arr.length;
        int [] result = new int[n];
        
        int j = 0;
        
        for(int i=0; i<d; i++){
            result [j] = arr[i];
            j++;
        }
        
        return result;
    } 
    
    public static void main( String[] args){
         Scanner sc = new Scanner ( System.in);
         
         System.out.println( "Enter size of array");
         int n = sc.nextInt();
         
         System.out.println( " Enter no of rotations");
          int d = sc.nextInt();
          
          int arr[] = new int[n];
          
          System.out.println(" Enter the Elements of the array");
          
          for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            
          }
          
          int[] result = rotateleft( d, arr);
          
          System.out.println( " Rotated array");
          
          for( int i=0; i<n; i++){
            
            System.out.println(result[i] + " ");
            
            
          }
         sc.close();
    }
        
        
    }
