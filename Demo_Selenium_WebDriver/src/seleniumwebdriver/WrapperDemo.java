package seleniumwebdriver;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=100;
		Integer i1 = new Integer(i);	//converting primitive to object
		Integer i2 = new Integer("100");	//converting string to integer object
		String str1=i2.toString();
		System.out.println(str1);
		String str = "333";
		int val =  Integer.parseInt(str);
		System.out.println(val);

	}

}
