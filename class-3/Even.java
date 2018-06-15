import java.util.*;
class Even{
public static void main(String[] args){
int i;
int n=0;
Scanner sc;
sc=new Scanner(System.in);
System.out.print("enter the value of n");
n=sc.nextInt();
for(i=1;i<n;i++)
{
if(i%2==0)
System.out.print(i+" ");
}
System.out.println();
}
}