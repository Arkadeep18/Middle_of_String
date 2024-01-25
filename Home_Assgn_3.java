import java.util.*;
public class Home_Assgn_3 {

	public static char middle_char(String str) {
		return str.charAt(str.length()/2);			//charAt defines index and length/2 finds the middle point
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		
		System.out.println(middle_char(str));
	}

}
