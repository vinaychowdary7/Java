import java.io.*;
import java.util.*;
class JavaPractice
{
	public static void main(String args[])
	{
		int i,n;
		int[]  a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		mergesort(a,0,n-1);
		System.out.println("After sorting:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+"\t");
		}
		public static void mergesort(int[] a,int low,int high)
		{
			int mid;
			if(low<high)
			{
				mid=(low+high)/2;
				mergesort(a,low,mid);
				mergesort(a,mid+1,high);
				merge(a,low,mid,high);
			}
		}
		public static void merge(int[] a,int low ,int mid,int high)
		{
			int[] b=new int[10];
			int i,j,k;
			i=low;
			j=mid+1;
			k=low;
			while(i<=mid && j<=high)
			{
				if(a[i]<a[j])
				{
				b[k]=a[i];
				k++;
				i++;
				}
				else
				{
				b[k]=a[j];
				k++;
				j++;
				}
			}
			if(i>mid)
			{
				while(j<=high)
				{
				b[k]=a[j];
				k++;
				j++;
				}
			}
			else
			{
				while(i<=mid)
				{
				b[k]=a[i];
				k++;
				i++;
				}
			}
			for(i=low;i<=high;i++)
			{
			    b[i]=a[i];
			}
		}
	}
}