#include<iostream.h>
#include<conio.h>
void main()
{
clrscr();
cout<<" ";              
int a=0,b=1,c=0;
cout<<a;
for (int i=0;i<=5;i++)
{
a=b;
b=c;
c=a+b;
cout<<c;
}
getch();
}
