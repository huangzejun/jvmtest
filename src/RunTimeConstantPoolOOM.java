
public class RunTimeConstantPoolOOM {
	public static void main(String[] args){
		String abcde = "aaa";
		String str1 = new StringBuilder("aa").append("a").toString();
		System.out.println(str1.intern() == str1);
		Integer.bitCount(8);
	}
}
