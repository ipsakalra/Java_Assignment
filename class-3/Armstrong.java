class Armstrong{
public static void main(String[] args){
int n=153;
int a,b,c,d,e;
a=n/100;
b=n%100;
c=b/10;
d=b%10;
e=(a*a*a)+(c*c*c)+(d*d*d);
if(n==e){
System.out.println("armstrong no");
}
else
{
System.out.println("not a armstrong no");
}
}
}