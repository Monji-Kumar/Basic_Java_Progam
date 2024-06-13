public class P13{
	public P13(int n){
		this();
		System.out.println("The number is : "+n);
	}
	public P13(){
	super();
	System.out.println("All loading is done");
	}
	public static void main(String [] args){
		new P13(5);
	}
}