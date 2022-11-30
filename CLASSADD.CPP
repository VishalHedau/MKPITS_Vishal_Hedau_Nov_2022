#include<iostream.h>
#include<conio.h>
class addDemo
{
public:
int num1, num2, res;
	void setData()
	{
	cout<<"Enter num1 & num2:\n";
	cin>>num1>>num2;
	}
	void calculate()
	{
	res=num1+num2;
	}
	void disp()
	{
	cout<<"result="<<res;
	}
};
void main()
{
clrscr();
addDemo ob;
ob.setData();
ob.calculate();
ob.disp();
getch();
}