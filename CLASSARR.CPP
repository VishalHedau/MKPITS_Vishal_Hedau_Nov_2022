#include<iostream.h>
#include<conio.h>
class array
{
public:
int a[5],i;
void setData();
void disp();
};
       void array::setData()
	{
	cout<<"Enter 5 number in array:\n";
	for(i=0;i<=4;i++)
	{
	cin>>a[i];
	}
	}
       void array::disp()
	{
	for(i=0;i<=4;i++)
	{
	cout<<a[i];
	}
	}
void main()
{
clrscr();
array ob;
ob.setData();
ob.disp();
getch();
}