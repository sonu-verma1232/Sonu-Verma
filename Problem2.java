import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int a = sc.nextInt();
        
       
        for (int i = 1; i <= a; i++) {
            int oddNumber = 2 * i - 1;  
            if (i == a) {
                System.out.print(oddNumber); 
            } else {
                System.out.print(oddNumber + ", ");
            }
        }
        
        sc.close();
    }
}
