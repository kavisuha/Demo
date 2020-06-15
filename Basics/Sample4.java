public class Sample4{
	public static void main(String[] args) {
		char s = args[0].charAt(0);
		char s1 = args[1].charAt(0);
		int n1 = (int)s;
		int n2 = (int)s1;
		if(n1 < n2) System.out.println(args[0]+","+args[1]);
		else System.out.println(args[1]+","+args[0]);
	}
}