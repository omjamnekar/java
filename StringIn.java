class StringIn{

	public static void main(String args[]){

		String str = "Hello World";
		String strs= "This is Java";
 		String str2= "Hello World";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		System.out.println(str.length());
		System.out.println(str.charAt(4));
		System.out.println(str.startsWith("h"));
		System.out.println(str.endsWith("h"));	
		String s2 = str.replace("Is","As");	
		System.out.println(s2);	
		System.out.println(str.equals(str2));	
		System.out.println(str.equalsIgnoreCase(str2));	
		System.out.println(str.concat(str2));
			
		
		System.out.println(str.substring(2,6));
	

	
	}
}



