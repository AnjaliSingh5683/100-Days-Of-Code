import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while( t-- > 0 ) {
            int x = inp.nextInt();
            int y = inp.nextInt();
            System.out.println( Math.max( x, y) );
        }
    }
}