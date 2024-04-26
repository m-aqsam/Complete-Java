#include<iostream>
using namespace std;

// whether the given numis positive,negative or zero

int main(){

int num;

cout<<"Enter your number :";
cin>>num;

if (num>=1)
{
    cout<<num<<" is positive .";
}

else if (num<0)
{
    cout<<num<<" is negative . "; 
}

else
{
    cout<<" The given number is zero .";  
}



    return 0;
}