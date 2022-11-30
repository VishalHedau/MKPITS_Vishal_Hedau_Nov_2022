#include<stdio.h>
#include<conio.h>

void main ()
{
int a=50,b=20;
clrscr();

printf("%d\n",(a>b)&&(a<b)); //0
printf("%d\n",(a>b)||(a<b)); //1
printf("%d\n",!(a>b));       //0
getch();
}