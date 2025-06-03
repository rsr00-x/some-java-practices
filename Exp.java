public class Exp
{
	private String message;

	public void MyExp(String m)
	{
		message = m;
		System.out.println(message);
	}

	public String MyNewExp(String m)
	{
		message = m;
		return message;
	}

	public static void main(String[] Parameters)
	{
		Exp f1 = new Exp();
		f1.MyExp("Hello Students");

		Exp f2 = new Exp();
		String msg = f2.MyNewExp("Hello Polapain");
		System.out.println(msg);
	}
}
