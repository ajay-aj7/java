JVACclass Star7
{
public static void main(String args[])
{
 int space=4,star=0;
for(int i=1; i<=7;i++)
{
if (i<=4)
{
space --;
star ++;
}
else 
{
space ++;
star --;
}


for(int j=1;j<=space;j++)
{
System.out.print("  ");
}

for(int j=1;j<=star;j++)
{
System.out.print("* ");
}
for(int k=1;k<=4;k++)
{
if((star==3)||(star==4))
{
System.out.print("* ");
}
}
System.out.println( );
}
}
}
