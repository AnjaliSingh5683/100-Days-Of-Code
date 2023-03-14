/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner RR=new Scanner(System.in);
		int T=RR.nextInt();
		while(T-->0){
		    int C_cho=RR.nextInt();
		    int X_cho=RR.nextInt();
		    int Y_rupees=RR.nextInt();
		    
		    System.out.println((C_cho-X_cho)*Y_rupees);
		}
	}
}
