import java.util.LinkedHashMap;
import java.util.Scanner;

public class P1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String para=sc.nextLine();
        para.trim();
        para=para+" ";
        sc.close();
        int no_wrd=0;
        for(int i=0;i<para.length();i++){
            if(para.charAt(i)==' ')
                no_wrd++;
        }
        LinkedHashMap<String,Integer> l=new LinkedHashMap<String,Integer>();
	int j=0;
        for(int i=1;i<=no_wrd;i++){
            String wrd="";
		int count=0;
            for(;j<para.length();j++){
                if(para.charAt(j)!=' '){
                    wrd=wrd+para.charAt(j);
                }
                else{
                    	j++;
			break;
		}
            }
            for(int k=0;k<para.length()-wrd.length();k++){
                if(para.substring(k, k+wrd.length()).equals(wrd))
                    count++;
            }
            l.put(wrd, count);
	count=0;
        }
        System.out.println(l.entrySet());
    }
}