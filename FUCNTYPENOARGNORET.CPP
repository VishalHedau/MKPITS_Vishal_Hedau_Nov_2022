      //function with no returntype & no argument

#include<stdio.h>
#include<conio.h>
void num()
{
clrscr();
int num,n1,n2,n3,rev;
printf("Enter 3 digit no : ");
scanf("%d",&num);
	n1=num%10;
	num=num/10;
	n2=num%10;
	num=num/10;
	n3=num%10;
	printf("%d%d%d",num,n1,n2,n3);
	rev=n1*100+n2*10+n3*1;
	printf("rev order =%d",rev);
	getch();
}
void main()
{
num();
getch();
}