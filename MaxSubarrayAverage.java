public class MaxSubarrayAverage {
    public static void main(String[] args) {
        int[] nums={5};
        int max=0;
        int k=1;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            System.out.println(i);
            for(int j=i;j<i+k;j++)
            {
                sum=sum+nums[j];
                System.out.println(sum);
                System.out.println(j);
            }
            if(max<sum)
            {
                max=sum;
            }
        }
        float ans=(float)max/4;
        System.out.println(ans);
    }
}
