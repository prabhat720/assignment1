package pp1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String pattern = "[a-z]+";
		String check = "Regular expressions ";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );


	}

}
