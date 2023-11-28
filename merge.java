import java.io.*;
import java.util.*;
class Merge
{
    public static void main(String[] args)
    {
        int n,i;
        int a[];
        Scanner sc=new Scanner(System.in);
        System.out.println("enre size");
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("before sorting");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]+"\t");
        }
        mergesort(a,0,n-1);
        System.out.println("after sorting");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]+"\t");
        }
    }
    public static void mergesort(int a[],int low,int high)
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
    public static void merge(int a[],int low,int mid,int high)
    {
        int i,k,j;
        int b[];
        b=new int[10];
        i=low;
        k=low;
        j=mid+1;
        while(i<=mid && j<=high)
        {
            if(a[i]<a[j])
            {
                b[k++]=a[i++];
            }
            else 
            {
                b[k++]=a[j++];
            }
        }
        if(i<=mid)
        {
            while(i<=mid)
            {
                b[k++]=a[i++];
            }
        }
        else
        {
            while(j<=high)
            {
                b[k++]=a[j++];
            }
        }
        for(i=low;i<=high;i++)
        {
            a[i]=b[i];
        }   
    } 
}