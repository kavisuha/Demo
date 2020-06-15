public class Sample17{
	public static void main(String[] args) {
		int a= args[0].length();
		int i = 0,count = 0;
		while(i < a){
			if((args[0].charAt(i)) == (args[0].charAt(a-i-1))) count++;
			i++;
		}
		if(count == a) System.out.println(args[0]+"is a palindrome");
		else System.out.println(args[0]+" is not a palindrome");
	}
}