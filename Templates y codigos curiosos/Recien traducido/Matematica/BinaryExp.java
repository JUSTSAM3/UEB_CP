// Iterative Java program to  
// compute modular power 

public class BinaryExp {

    /* Iterative Function to calculate 
       (x^y)%p in O(log y) */
    static int power(int x, int y, int p) {
        // Initialize result 
        int res = 1;
        // Update x if it is more   
        // than or equal to p 
        x = x % p;
        if (x == 0) {
            return 0; // In case x is divisible by p;    
        }
        while (y > 0) {
            // If y is odd, multiply x 
            // with result 
            if ((y & 1) == 1) {
                res = (res * x) % p;
            }
            // y must be even now 
            // y = y / 2 
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }

    // Driver Program to test above functions 
    public static void main(String args[]) {
        int x = 2;
        int y = 5;
        int p = 13;
        System.out.println(power(x, y, p));
    }
}
