//Write a java program that stores an  arrays of strings and sort in a particular alphabetic  order.
    //Java Program to sort an array in alphabetical order.
import java.util.Arrays;  
import java.util.Scanner;

public class TASK_1  
{  
   public static void main(String args[])   
   {  
      Scanner sc=new Scanner(System.in);
      int n;   //Declare the array size
      System.out.println("Enter the number of elements ");
      n=sc.nextInt();    //Initialize the array size

      String fruits[]=new String[n];   //Declare the array
      System.out.println("Enter the String ");
      Scanner sc1=new Scanner(System.in);    
      for(int i=0; i<n ;i++)     //Initialize the array
      {
          fruits[i]=sc1.nextLine();
      }
 
        //logic for sorting     
         for(int i = 0; i<n; i++)   //Holds each element
         {  
             for (int j = i+1; j<n; j++)  //Check for remaining elements 
             {  
                //compares each elements of the array to all the remaining elements  
                if(fruits[i].compareTo(fruits[j])>0)   
                {  
                    //swapping array elements  
                    String temp = fruits[i];  
                    fruits[i] = fruits[j];  
                    fruits[j] = temp;  
                 }  
              }  
           }  
           //prints the sorted array in alphabetical order  
           System.out.println(Arrays.toString(fruits));  
       }  
}  
