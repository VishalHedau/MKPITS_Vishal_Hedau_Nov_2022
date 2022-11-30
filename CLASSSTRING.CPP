#include<iostream.h>
#include<conio.h>
class array
{
public:
int id;
char name[10];
	void setData()
	{
	cout<<"Enter id of an employee:\n ";
	cin>>id;
	cout<<"Enter name of an employee:\n";
	cin>>name;
	}
	void disp()
	{
	cout<<id<<"Id number:\n ";
	cout<<name<<"Employee Name:\n";
	}
};
void main()
{
array ob;
ob.setData();
ob.disp();
getch();
}