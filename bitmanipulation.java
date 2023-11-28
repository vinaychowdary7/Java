public class bitmanipulation {
    public static void main(String[] args) {
        int n=5;
        int pos=0;
        int bitMask=1<<pos;
        int ope =1;
        if(ope==0)
        {
            if((~(bitMask) & n)==0)
            {
                System.out.println("bit was zero");
            }
            else{
                System.out.println("Bit is non-zero");
                System.out.println(~(bitMask)&n);
            }
        }
        else{
            if((bitMask |n)==0)
            {
                System.out.println("bit was zero");
            }
            else{
                System.out.println("bit is non-zero");
                System.out.println(bitMask|n);
            }
        }
    }
}
