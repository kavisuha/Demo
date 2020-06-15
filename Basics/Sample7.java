public class Sample7{
	public static void main(String[] args) {
		char a = args[0].charAt(0);
		int b = (int)a;
		if(a >= 'A' && a <= 'Z'){
			char s1 = (char)(b+32);
			System.out.println(a+"->"+s1);
		}
		else{
			char s2 = (char)(b-32);
			System.out.println(a+"->"+s2);
		}
	}
}