public class reversingarray {
     public static void main(String[] args) {
        int a[]={1,2,3,4};
        int[] b= new int[20];
        for(int i=4-1;i>=0;i--){
            b[3-i]=a[i];
        }  
        for(int i=0;i<4;i++){
            a[i]=b[i];
        } 
        for(int i=0;i<4;i++)
        { 
            System.out.println(a[i]);
        }
    }
}
