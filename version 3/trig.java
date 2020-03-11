/**
This class calculates trignometric functions like 
SIN, COS, TAN and Radians to degree conversion function */


package version3;

import java.util.Scanner;

public class trig
{
	public static void main(String[] args)
	{
		float n;
		trig t = new trig();
		Scanner in = new Scanner(System.in);   //Takes input from user
		System.out.println("Enter x value : ");
		n=in.nextFloat();                             
		t.radtodegree(n);
		t.sinvalue(n);
		t.cosvalue(n);
		t.tanvalue(n);
		in.close();
	}
	float radtodegree(float n)   //Radian to degree conversion function
	{
		float x = (float)(n * 57.2958);
		return x;
	}
	float sinvalue(float n)
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
	float cosvalue(float n)
	{
		double denominator, sum;
		
		double x1=1;
		sum= x1;
		int i=1;
		do
		{
			denominator = 2*i*(2*i-1);
			x1 = (-x1 * n * n / denominator);
			sum = sum + x1;
			i = i + 1;
		}while(i<=100);
		
		return (float)sum;
		
	}
	float tanvalue(float n)
	{
		return 0;
	}
}
