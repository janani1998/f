class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=5;
		int a[]={-2,3,1,45,-5};
		int min=a[0];
		for(int i=0;i<5;i++){
		if(a[i]<min)
		{
			min=a[i];
		}
		}
		System.out.println(min);
	}
}
