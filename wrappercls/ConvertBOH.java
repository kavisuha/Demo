public class ConvertBOH {
		public static void main(String[] args) {
			Integer num = Integer.parseInt(args[0]);
			System.out.println("Given NUmber : "+num);
			System.out.println("Binary equivalent : "+Integer.toBinaryString(num));
			System.out.println("Octal equivalent : "+Integer.toOctalString(num));
			System.out.println("Hexadecimal equivalent : "+Integer.toHexString(num));
		}
	}
