
public class SwappingV1 {

	public static void main(String[] args) {
		//Swapping
	    String name1 = "Sai";
	    String name2 = "teja";
	    System.out.println("Before swapping...");
	    System.out.println("name---->"+name1);
	    System.out.println("name---->"+name2);
	    
	    String t;
	    t = name1;
	    name1 = name2;
	    name2 = t;
		
		
		System.out.println("After swapping...");
	    System.out.println("name---->"+name1);
	    System.out.println("name---->"+name2);

	}

}
