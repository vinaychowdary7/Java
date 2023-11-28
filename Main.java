import java.util.Scanner;

class Student {
	String name;
	String stu_id;
	int score;
}

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input number of students:");
		int n = in.nextInt();
		System.out.println("Input Student Name, ID, Score:");
		Student[] stu = new Student[n];
		for(int i=0;i<n;i++){
			stu[i]= new Student();
		}
		for (int i = 0; i < n; i ++) {
			stu[i].name = in.next();
			stu[i].stu_id = in.next();
			stu[i].score = in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int index=i;
			for(int j=i+1;j<n;j++)
			{
				if(stu[j].score<stu[index].score)
				{
					index=j;
				}
			}
			Student temp=stu[index];
			stu[index]=stu[i];
			stu[i]=temp;
		}
		System.out.println("name, ID of the highest score and the lowest score:");
		for(int i=0;i<n;i++)
		{
			System.out.println(stu[i].name + " " +stu[i].stu_id+" "+stu[i].score);
		}
		in.close();
	}
}
