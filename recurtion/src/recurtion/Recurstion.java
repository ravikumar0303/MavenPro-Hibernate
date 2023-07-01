

 class Recurstion {
	int func (int n)
	{
		int result;
		if (n==1)
			return 1;
		result = func (n-1);
		return result;
	}

}
class Output
{
public static void main(String[] args) {
	Recurstion obj=new Recurstion();
	System.out.println(obj.func(5));
}	
}