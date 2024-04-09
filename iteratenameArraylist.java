import java.util.ArrayList;
class Main{
	public static void main(String agrs[]){
		ArrayList<String> name = new ArrayList<>();
		name.add("Apple");
		name.add("banana");
		name.add("mango");
		name.add("PainApple");
		name.add("Grapes");
		name.add("Oranage");
		name.set(2,"pump");
		name.remove(2);
		 System.out.println("iterate name in ArrayList !");
		 for( String loop :name){
			 System.out.println(loop);
	}}
}