package singleton.ex1;

public class Main {

	public static void main(String[] args) throws Exception{
		Singleton s1 = Singleton.instance();
		Singleton s2 = Singleton.instance();
		System.out.println(s1 == s2);

		//Singleton s3= (Singleton) Class.forName("singleton.ex1.Singleton").newInstance();

		//System.out.println(s1==s3);
	}

}
