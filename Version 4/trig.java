/**
This class calculates all the trignometric functions like 
SIN, COS, TAN and Radians to degree conversion function */


package version4;
import java.util.*;
public class trig
{
	public static void main(String[] args)
	{
		float n;															// variable to take input from the user
		trig t = new trig();												// object created to the main class
		Scanner in = new Scanner(System.in);								// objected created to the scanner class to take input from the user
		System.out.println("Enter x value : ");								
		n=in.nextFloat();													// Storing user input in the variable n
		
		System.out.println(n+" Radians = "+t.radtodegree(n)+" Degrees");    // Calling the method radtodegree()
		System.out.println("Sin("+n+")= "+t.sinvalue(n));					// Calling the method sinvalue()
		System.out.println("Cos("+n+")= "+t.cosvalue(n));					// Calling the method cosvalue()
		t.tanvalue(n);														// Calling the method tanvalue()
		
		//System.out.println("sin(x)="+t.d);
		in.close();                                                         // CLosing the object of Scanner Class
	}
	
	float radtodegree(float n)                                              // Function 
	{
		float x = (float)(n * 57.2958);
		return x;
	}
	
	float sinvalue(float n)                                                //function to calculate trignometric sine function
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
		float s = sinvalue(n);
		float c = cosvalue(n);
		double sum = s / c;
		if(c==0)
		{
			System.out.println("Tan("+n+")= infinity");
		}
		else
		{
			System.out.println("Tan("+n+")= "+sum);
		}

		return (float)sum;
	}
}