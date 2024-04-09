import java.util.Set;
import java.util.LinkedHashSet;
class Main{
	public static void main(String args[]){
		Set<String> set =new LinkedHashSet<>();
		for(int i=30;i>=0;i--){
			set.add("A"+i);
		}
		System.out.println(set);
	}
}
