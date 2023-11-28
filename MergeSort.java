public class MergeSort {
        public static void main(String[] args) {
            int []a={9,8,7,6,5,4,3,2,1};
            int l=a.length;
            msort(a,0,l-1);
            for(int i=0;i<a.length;i++)
            {
                System.out.println(a[i]);
            }
        }   
        public static void msort(int a[],int low,int high)
        {
            if(low<high)
            {
                int mid=(low+high)/2;
                msort(a,low,mid);
                msort(a,mid+1,high);
                merge(a,low,mid,high);
            }
        }
        public static void merge(int a[],int low,int mid,int high)
        {
            int b[];
            b=new int[10];
            int i,j,k;
            i=low;
            j=mid+1;
            k=low;
            while(i<=mid && j<=high)
            {
                if(a[i]<a[j])
                {
                    b[k]=a[i];
                    i++;
                    k++;
                }
                else{
                    b[k]=a[j];
                    j++;
                    k++;
                }
            }
            if(i<=mid)
            {
                while(i<=mid)
                {
                    b[k]=a[i];
                    k++;
                    i++;
                }
            }
            else{
                while(j<=high)
                {
                    b[k]=a[j];
                    j++;
                    k++;
                }
            }
            for(int h=low;h<=high;h++)
            {
                a[h]=b[h];
            }
        }
}
