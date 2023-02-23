import java.util.*;

public class conditional {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int age =a.nextInt();
        if(age%2==0)
        {
            System.out.println("Even");
        } 
        else{
            System.out.println("Odd");
        }
        a.close();
    }
}
