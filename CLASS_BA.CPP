#include<stdio.h>
#include<conio.h>
#include<iostream.h>
class one
{
public:
int a,b;
	void setvalue()
	{
	a=2,b=3;
	}
	void displayvalue()
	{
	cout<<" a= "<<a<<" b= "<<b;
	}
};
void main()
{
clrscr();
one ob;
ob.setvalue();
ob.displayvalue();
getch();
}