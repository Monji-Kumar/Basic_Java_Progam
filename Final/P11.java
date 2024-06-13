import java.util.TreeMap;
public class P11{
	public static void main(String [] args){
		TreeMap<Integer,Employee> t=new TreeMap<Integer,Employee>();
		Employee e=new Employee("Manish",5000.0);
		t.put(1,e);
		e=new Employee("Pulkit",6000.0);
		t.put(2,e);
		e=new Employee("Manoj",10000.0);
		t.put(3,e);
		e=new Employee("Monji",9000.0);
		t.put(4,e);
		int key=1;
		e=t.get(1);
		double max=e.getSalary();
		for(int i=2;i<=4;i++){
			e=t.get(i);
			if(max<e.getSalary())
			{
				max=e.getSalary();
				key=i;
			}
			
		}
		e=t.get(key);
		System.out.println(e.getSalary());
		System.out.println(e.getName());
	}
}