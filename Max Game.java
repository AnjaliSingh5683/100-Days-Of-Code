import java.io.*;
import java.util.*;
 
 
public class TestClass {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i=0;i<N;i++){
            int n = scan.nextInt();
            int a=1;
            int c=1;
            while(a<=n){
                c=a;
                a*=2;
            }
            System.out.println(c);
        }
    }
}