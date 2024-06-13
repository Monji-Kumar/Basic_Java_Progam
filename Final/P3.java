import java.util.Scanner;
public class P3{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter size of array : ");
	int size=sc.nextInt();
	int a[]=new int[size];
	for(int i=0;i<size;i++)
		a[i]=sc.nextInt();
		int max=a[0],min=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		int check=min;
		for(int i=0;i<a.length;i++){
			int flag=1;
			for(int j=i;j<a.length;j++){
				if(a[j]==check){
					flag=0;
					check++;
				}
			}
			if(flag==1)
				break;
		}
		if(check<=max)
		System.out.println(check);
		else
		System.out.println("No missing number");
	}

}