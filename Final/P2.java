import java.util.Scanner;
public class P2{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The name : ");
		String name=sc.nextLine();
		name=name+" ";
		String rev="";
		String wrd="";
		for(int i=0;i<name.length();i++){
			if(name.charAt(i)!=' '){
				wrd=wrd+name.charAt(i);
			}
			else{
				rev=wrd+" "+rev;
				wrd="";
			}
		}
		System.out.println("The name in reverse is : "+rev);
	}
}