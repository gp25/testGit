package DigilyticsAI;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Singleton {
	
	public String str;
	
	private Singleton() {
		str="Hello world";
	}
	private static Singleton sing_inst=null;
	public static Singleton instance() {
		if(sing_inst==null) {
			sing_inst=new Singleton();
		}
		return sing_inst;
	}
	
	public static void main(String[] args) {
		Singleton a=Singleton.instance();
		Singleton b=Singleton.instance();
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.stream().filter(e -> e>2).collect(Collectors.toList());
		
		
	}

}
