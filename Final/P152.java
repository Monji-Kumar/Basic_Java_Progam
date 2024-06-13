public class P152 extends P151{
	public static void main(String [] args){
		P151 p=new P151();
		P152 p1=(P152)p; //will throw ClassCastException
	}
}