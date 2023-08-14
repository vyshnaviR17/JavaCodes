public class ReverseString{
    public static void main(String[] args){
    String s1 = "Live life to its fullest";
		String[] chr = s1.split(" ");
		for(String var : chr) {
			System.out.print(reverse(var)+" ");
		}
	}
	public static String reverse(String s) {
		StringBuilder str = new StringBuilder();
		for(int i=s.length()-1; i>=0; i--) {
			str.append(s.charAt(i));
		}
		return str.toString();
	}
	
}
