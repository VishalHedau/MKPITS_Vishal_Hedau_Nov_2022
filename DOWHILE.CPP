#include<stdio.h>
#include<conio.h>
#include<iostream.h>
void main(){
int i=1;
char ch;

do
{
cout<<"press Y/N";
cin>>ch;
i++;
}
while(ch!='N');
clrscr();
getch();
}