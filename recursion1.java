public class recursion1{
    public static void reverse(String s,int n)
    {
        if(n==-1)
        {
                return;
        }
        System.out.println(s.charAt(n));
        reverse(s,n-1);

    }
    public static void main(String[] args){
        String s="hello";
        int n=s.length()-1;
        reverse(s,n);
    }
}
