#include<stdio.h>
#include<conio.h>
#include<iostream.h>

int main()
{
clrscr();
int x, numbers[5], total=0;
cout<<"Enter first number : ";
cin>>numbers[0];
cout<<"Enter second number : ";
cin>>numbers[1];
cout<<"Enter third number : ";
cin>>numbers[2];
cout<<"Enter fourth number : ";
cin>>numbers[3];
cout<<"Enter fifth number : ";
cin>>numbers[4];
	for(x=0; x<5; x++){
	if((numbers[x]%2) != 0)
	{
	total += numbers[x];
	}
	}
	cout<<"Sum of all odd numbers : "<<total;
	getch();
}





