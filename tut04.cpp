#include<iostream>
using namespace std;

//structure call by a function

struct workers 
{
    int wId;
    char favchar;
    double salary; 
};

void ali(){ 

struct workers ali; 
ali.wId=1; 
ali.favchar='A';
ali.salary=40000;

cout<<"ALi id is : "<<ali.wId<<endl;
cout<<"ALi favchar is : "<<ali.favchar<<endl;  
cout<<"ALi salary is : "<<ali.salary<<endl; 


}

int main(){ 

ali(); 
 

    return 0;
}