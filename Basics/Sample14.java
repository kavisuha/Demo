public class Sample14{
	public static void main(String[] args) {
		int a = args[0].length();
		int sum = 0,num1 = 0;
		for(int i = 0; i < a; i++){
			num1 = Integer.parseInt(String.valueOf(args[0].charAt(i)));
			sum = sum + num1;
		}
		System.out.println(sum);
	}
}