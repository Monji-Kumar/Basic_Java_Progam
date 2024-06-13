public class P12{
	public static void test() throws ArithmeticException{
		System.out.println(10/0);
	}
	public static void main(String [] args){
		try{
			test();
		}catch(ArithmeticException E){
			System.out.println("Denominator is 0");
		}
		finally{
			System.out.println("The Program is completed");
		}
	}
}