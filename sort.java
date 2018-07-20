class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=5,temp=0;
		int a[]={-1,-2,-3,-4,-5};
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
	}
}
