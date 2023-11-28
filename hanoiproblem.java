public class hanoiproblem{
    public static void hanoi(int x,String source, String helper,String destination )
    {
        if(x==1){
                System.out.println("Transfered Disk "+x+" from "+source+" to "+destination);
                return ;
        }
        hanoi(x-1,source,destination,helper);
        System.out.println("Transfered Disk "+x+" from "+source+" to "+destination);
        hanoi(x-1,helper,source,destination);
    }
    public static void main(String[] args){
        int x=2;
        hanoi(x,"S","H","D");
    }
}
