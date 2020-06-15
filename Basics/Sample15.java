public class Sample15{
	public static void main(String[] args) {
	int s = Integer.parseInt(args[0]);
	int s1 = args.length;
	if(s1 == 1){
		for(int i = 1; i <= s; i++){
			for (int j = 1;j <= i ;j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}
	else 
       
       System.out.println("Please enter an integer number");
	
}
}