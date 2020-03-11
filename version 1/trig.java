/**program to print sin , cos, tan value forgiven input
* program is a prototype for printing trignometric functions values
*/
package version1;

import java.util.Scanner;

public class trig
{
	public static void main(String[] args)
	{
		float n;
		trig t = new trig();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter x value : ");
		n=in.nextFloat();                             
		t.radtodegree(n);
		t.sinvalue(n);
		t.cosvalue(n);
		t.tanvalue(n);
		in.close();
	}
	float radtodegree(float n)   //unimplemented radian to degree fucntions with expected return type float
	{
		return 0;
	}
	float sinvalue(float n)       //unimplemented sinvalue fucntions
	{
		return 0;
	}
	float cosvalue(float n)      //unimplemented cosvalue fucntions
	{
		return 0;
	}
	float tanvalue(float n)       //unimplemented tanvalue fucntions
	{
		return 0;
	}
}
