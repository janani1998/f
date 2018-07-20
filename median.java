class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
       int n=5,i,j,temp;
       int a[]={-1,-2,-3,-4,-5};
       for( i=0;i<5;i++)
       {
       	for( j=i+1;j<5;j++){
       	if(a[i]>a[j])
       	{
       		temp=a[i];
       		a[i]=a[j];
       		a[j]=temp;
       	}
       }
	}
	int l=a.length/2;
	System.out.print(a[l]);
}
}
