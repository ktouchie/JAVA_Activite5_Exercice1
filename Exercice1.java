import java.util.*;
class Exercice1 {
    
    public static void main(String [] args) {  

        int a[] = {1,2,3,4,5};
        
        int sum = 0;
        
        for (int i=0; i< a.length; i++) {
            sum = sum + a[i];
        }
        
        System.out.println("The sum of the elements in array {1,2,3,4,5} is " + sum);

    }
}