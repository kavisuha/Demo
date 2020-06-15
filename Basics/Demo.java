import java.util.*;
public class  Demo{
	static int separate(int n){
		int val = 0;
		while(n > 0){
			val = n%10;
			break;
		}
		return val;
	}
	static boolean lastDigit(int x,int y){
		if(x == y) return true;
		else return false;
	}	
	public static void main(String[] args){
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int x = separate(n1);
		int y = separate(n2);
		boolean b = lastDigit(x,y);
		System.out.println(b);
		
	}
}