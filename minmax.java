import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        int[] arr= new int[20];
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //bubblesort(arr,n);
        selectionsort(arr, n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    public static void bubblesort(int arr[],int n) {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        } 
    }
    public static void selectionsort(int arr[],int n)
    {
        int temp,i,j,min;
        for(i=0;i<n;i++)
        {
            min=i;
            for(j=i;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}    
