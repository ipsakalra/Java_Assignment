class Arr_asn{
public static void main(String[] args){
int a[]={1,1,1,1,0,0,1,0};
int i,j;
for(i=0;i<8;i++)
{
for(j=0;j<i;j++)
{
int temp;
if(a[j]>a[i])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(i=0;i<8;i++)
{
System.out.println(a[i]+" ");
}
System.out.println(" ");
}
}