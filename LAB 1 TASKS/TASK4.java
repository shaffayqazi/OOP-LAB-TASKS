public class TASK4 {
    public static void main(String[] args) {
        
    
    int count=0, i, sum=0;

  for(i=1;i<=100;i++)
  {
    sum+=i;
    count++;
  }
   System.out.println("The Sum is : "+ sum);
   float average = sum/count;
   System.out.println(average);
}
}
