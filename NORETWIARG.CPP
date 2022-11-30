//function with no return type with argument

#include<stdio.h>
#include<conio.h>
void rev(int num)
{
int n1,n2,n3,rev;
n1=num%10;
num=num/10;
n2=num%10;
num=num/10;
n3=num%10;
rev=n1*100+n2*10+n3*1;
printf("Reverse order =%d ",rev);

}
void main ()
{
int num;
printf("Enter 3 digit no.");
scanf("%d",&num);
rev(num);
getch();
}