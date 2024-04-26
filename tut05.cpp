#include<iostream>
using namespace std;

// function call and prototyping

int sum(int ,int); 

int main(){

int n1,n2;


cout<<"Enter first num : ";
cin>>n1;
cout<<"Enter second num : ";
cin>>n2;
cout<<endl;
cout<<"Sum of " <<n1<<" and "<<n2<<" is  "<<sum(n1,n2); 

    return 0;
}

int sum(int a , int b ){

    int c=a+b;

return c;

}