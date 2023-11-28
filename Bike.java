import java.util.*;
class Bike
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	float a1,a2,a3,a4,a5;
	System.out.println("enter speed for a1:");
	a1=s.nextFloat();
	System.out.println("enter speed for a2:");
	a2=s.nextFloat();
	System.out.println("enter speed for a3:");
	a3=s.nextFloat();
	System.out.println("enter speed for a4:");
	a4=s.nextFloat();
	System.out.println("enter speed for a5:");
	a5=s.nextFloat();
	float avg=(a1+a2+a3+a4+a5)/5;
	if(a1>=avg)
	{
		System.out.println("a1 is qualified and speed is"+a1);
	}
	else if(a2>=avg)
	{
		System.out.println("a2 is qualified and speed is"+a2);
	}
	else if(a3>=avg)
	{
		System.out.println("a3 is qualified and speed is"+a3);
	}
	else if(a4>=avg)
	{
		System.out.println("a4 is qualified and speed is"+a4);
	}
	else
	{
		System.out.println("a5 is qualified and speed is"+a5);
	}
	s.close();
}
}