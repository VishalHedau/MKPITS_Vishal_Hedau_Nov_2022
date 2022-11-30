#include<stdio.h>
#include<conio.h>

void div (int x,int y,int z)
{
clrscr();
int e;
e=x/y/z;
printf("Div =%d",e);
}
void main()
{
clrscr();
int a=2,b=3,c=4;
div(a,b,c);
getch();
}

