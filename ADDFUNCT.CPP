#include<stdio.h>
#include<conio.h>
void add()
{
clrscr();
int a,b,res;
printf("Enter the number for addition \n");
scanf("%d%d",&a,&b);
res=a+b;
printf("Addition of 2 number = %d",res);
}
void main()
{
add();
getch();
add();
getch();
}