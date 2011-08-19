
public class ReverseString implements CharSequence{

	
	private String string;
	
	
	
	
	
	public static void main (String args[]){
		
		ReverseString reverseMe = new ReverseString("This is backwards!");
		
		System.out.println(reverseMe.toString());
		
	}
	
	
	 ReverseString(String newString){
		
		string = newString;
		
	}
	
	@Override
	 public int length(){
		
		return string.length();
	}

	@Override
	public char charAt(int i) {
		
		return string.charAt(i);
	}

	@Override
	public CharSequence subSequence(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString(){
		
		String newString = "";
		
		for (int i = (length())-1 ; i >= 0 ; i--){
		newString += string.charAt(i);
		}
		
		return newString;
		
	}
	 
	 
	 
	 
	
}
