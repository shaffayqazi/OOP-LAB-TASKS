import java.util.*;
public class TASk2 {
     public static void main(String[] args) {
     
        int count=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first character");
        char c1 = sc.next().charAt(0);

        System.out.println("Enter the second character");
        char c2 = sc.next().charAt(0);
        System.out.println("Character between are: ");
        for (char a=c1; a <=c2; a++) {
            System.out.print(a + " , ");
            count++;
        }
        System.out.println("\n The Total characters are "+ count );
    }
}
