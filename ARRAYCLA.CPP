#include<iostream.h>
#include<conio.h>
class array
{
public:
int id;
char name[20];
	void setData()
	{
	cout<<"Enter id : ";
	cin>>id;
	cout<<"Enter name :";
	cin>>name;
	}
	void disp()
	{
	cout<<id<<" ";
	cout<<name<<" ";
	}
};
void main()
{
array ob;
ob.setData();
ob.disp();
getch();
}