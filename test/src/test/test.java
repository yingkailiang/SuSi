package test;

import java.util.HashSet;
import java.util.Set;

public class test {
	private Set<String> permissions;
	public static void main(String args[]){
		test t = new test();
		t.te("test");
	}
	public void te(String str){
		if(this.permissions == null)
			this.permissions = new HashSet<>();
			this.permissions.add(str);
			this.permissions.add(str);
	}
}
