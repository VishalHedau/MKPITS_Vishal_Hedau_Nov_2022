#include<stdio.h>
#include<conio.h>
#include<iostream.h>

int main()
{
clrscr();
	int x;
	cout<<"\nEnter an integer : ";
	cin>>x;
	if(x>=0 && x<=25)
	{
	cout<<"Range[0,25]\n";
	}
	else if(x>=26 && x<=50)
	{
	cout<<"Range (26,50]\n";
	}
	else if(x>=51 && x<=80)
	{
	cout<<"Range (51,80]\n";
	}
	else {
	cout<<"Outside the Range\n";
	}
	getch();

}




