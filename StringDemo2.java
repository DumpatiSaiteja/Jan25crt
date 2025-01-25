
public class StringDemo2 {

	public static void main(String[] args) {
		  String name1 = "Sai";
		    String name2 = "teja";
		    System.out.println("Before swapping...");
		    System.out.println("name1---->"+name1);
		    System.out.println("name2---->"+name2);
			name2 = name2+name1;
			name1 = name2.substring(0,name2.length()-name1.length());
			name2 = name2.substring(name1.length());
			
			System.out.println("After swapping...");
		    System.out.println("name---->"+name1);
		    System.out.println("name---->"+name2);
			}
	
}
