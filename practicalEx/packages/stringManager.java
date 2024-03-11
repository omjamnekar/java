class stringManager{


	public static void main(String args[]){


		String str ="HELLOWORLD";
		String str2= "This is Java";

		String str3 ="Hello World";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.startsWith("b"));	
		
		System.out.println(str.endsWith("h"));	
		String strs= str2.replace("is","as");
		System.out.println(strs);
		
		System.out.println(str.equals(str2));	
		
		System.out.println(str.concat(str3));
		System.out.println(str.substring(2,6));
		
	}
}