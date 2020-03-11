/**
This class calculates all the trignometric functions like 
SIN, COS, TAN and Radians to degree conversion function */

package version2;

import java.util.Scanner;

public class trig
{
	public static void main(String[] args)
	{
		float n;
		trig t = new trig();
		Scanner in = new Scanner(System.in);		//Takes input from user
		System.out.println("Enter x value : ");
		n=in.nextFloat();                             
		t.radtodegree(n);
		t.sinvalue(n);
		t.cosvalue(n);
		t.tanvalue(n);
		in.close();
	}
	float radtodegree(float n)		//Radian to degree conversion function
	{
		float x = (float)(n * 57.2958);
		return x;
	}
	float sinvalue(float n)			//SIN function
	{
	    float denominator, sum;  
	    
	    float x1 = (float)n;   
	    sum = x1;         
	    int i = 1;  
	    do
	    {  
	        denominator = 2 * i * (2 * i + 1);  
	        x1 = (float)(-x1 * n * n / denominator);  
	        sum = sum + x1;  
	        i = i + 1;  
	    }while (i<=100);  
	    return sum;
	}
	float cosvalue(float n)			//COS function
	{
		return 0;
	}
	float tanvalue(float n)			//TAN function
	{
		return 0;
	}
}
