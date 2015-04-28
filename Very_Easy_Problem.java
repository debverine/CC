/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Very_Easy_Problem
{
	public static double log2(int n)
	{
		return (Math.log(n)/Math.log(2));
	}
	
	public static void thefun(int n,PrintWriter pw)
	{
		if(n==0)
		{
			pw.print("0");
			//return;
		}
		else
		{
			pw.print("2");
			if((int)log2(n)!=1)
			{
				pw.print("(");
				thefun((int)log2(n),pw);
				pw.print(")");
			}
			if(n - ((int)Math.pow(2.0, (int)log2(n))) != 0)
			{
				pw.print("+");
				thefun(n-(int)(Math.pow(2.0,(int)log2(n))),pw);
			}
		}	
	}


	public static void main (String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int t,n;
		t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
			n=Integer.parseInt(br.readLine());
			pw.print(n+"=");
			thefun(n,pw);
			pw.println();
		}
		pw.flush();
		pw.close();
	}
}
