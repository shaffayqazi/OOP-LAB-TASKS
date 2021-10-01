public class Task1 {
    public static void main(String[] args) {
        int i;
        int count=0;
        System.out.println("The characters are: \n");
        

        for (i = 97; i <=122; i++) 
        {
            System.out.print( (char)i+" , ");
            count++;
            
            if(count%10==0)
            {
                System.out.println();
                
            }
        }

    }
}
