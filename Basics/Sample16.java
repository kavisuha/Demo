public class Sample16{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = args[0].length();
		while(b > 0) {
			System.out.print(args[0].charAt(b-1));
			b--;
		}
	}
}