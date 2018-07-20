class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=3;
		int a[]={1,2,3};
		int max=a[0];
		for(int i=0;i<3;i++){
		if(a[i]>max)
		{
			max=a[i];
		}
		}
		System.out.println(max);
	}
}
