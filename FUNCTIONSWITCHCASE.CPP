#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void add()
{
clrscr();
int a,b,res;
printf("Enter the number for addition : \n");
scanf("%d%d",&a,&b);
res=a+b;
printf("Addition of 2 number = %d",res);
}
void sub()
{
clrscr();
int a,b,res;
printf("Enter the number for subtraction : \n");
scanf("%d%d",&a,&b);
res=a-b;
printf("Subtraction of 2 number = %d",res);
}
void mul()
{
clrscr();
int a,b,res;
printf("Enter the numbder for multiplication : \n");
scanf("%d%d",&a,&b);
res=a*b;
printf("Multiplication of 2 number = %d",res);
}
void main()
{
int choice;
while(1)
{

printf("\n press 1 for addition \n");
printf("press 2 for subtraction \n");
printf("press 3 for multiplication \n");
printf("Enter 4 to exit");
printf("Enter your choice : ");
scanf("%d",&choice);
	switch(choice)
	{
	case 1:
	add();
	break;
	case 2:
	sub();
	break;
	case 3:
	mul();
	break;
	case 4:
	exit(0);
	default:
	printf("Invalid choice");
	}//switch close
	}//while close
getch();
}