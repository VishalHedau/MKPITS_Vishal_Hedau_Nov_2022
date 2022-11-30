#include<stdio.h>
#include<conio.h>
#include<iostream.h>

int sum(int a,int b)
{
return (a+b);
}
int sum(int a,int b,int c)
{
return (a+b+c);
}
int sum(int a,int b,int c,int d)
{
return (a+b+c+d);
}
void main()
{
int r;
cout<<sum(2,3,4);
getch();
clrscr();
}