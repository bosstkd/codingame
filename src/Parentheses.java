
public class Parentheses {
	  /**
     * Checks that the given string is​​​​​​‌​​​‌​‌​​​​‌‌‌​​​‌​‌​‌‌‌‌ correct.
     */
	static boolean check(String str) {
		if(str.length()==0) throw new IllegalArgumentException("str ne peut pas etre vide");
		int x = 0;
		for(int i=0; i<str.length(); i++){
		    if(str.charAt(i)=='(')x++;
		    if(str.charAt(i)==')')x--;
		    if(str.charAt(i)=='[')x++;
		    if(str.charAt(i)==']')x--;
		}
		
		if(x!=0)return false;

        if(str.charAt(0)==']' || str.charAt(0)==')' || str.charAt(str.length()-1)=='(' || str.charAt(str.length()-1)=='[')
	    return false;

		String st = str.replaceAll("\\(\\)","");
		st = st.replaceAll("\\[\\]","");
		
		if(st.contains("[)"))return false;
		if(st.contains("(]"))return false;

		return true;
		
	}
}
