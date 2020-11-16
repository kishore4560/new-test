package test;

public class Test {

	   public static void main(String[] args) {
	       String str="I will eat 2 burgers 23 fries & 1.25 cokes l8r";   
	       str=str.replaceAll("[^a-zA-Z]","");
	       str=str.replace("."," ");
	       str.trim();
	       String[] count = str.split(" ");

	       System.out.println(count.length);
	   }

	
}
