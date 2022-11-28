#include<stdio.h>
#include<conio.h>
#include<iostream.h>

int main()
{
clrscr();
float p,r,t,si;
cout<<"Enter principle amount : ";
cin>>p;
cout<<"Enter rate of interest : ";
cin>>r;
cout<<"Enter time period : ";
cin>>t;
si=(p*r*t)/100;
cout<<"\n Simple interest amount : "<<si;
getch();
}
