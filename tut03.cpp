#include<iostream>
using namespace std;
  
//Structures 


struct workers
{
   int wId;
   char favchar;
   double salary;
};


int main(){

    struct workers ali;  
    ali.wId=1;
    ali.favchar='A';
    ali.salary=40000;

cout<<"Ali id is : "<<ali.wId<<endl;
cout<<"Ali favchar is : "<<ali.favchar<<endl;
cout<<"Ali salary is : "<<ali.salary<<endl;  


 

    return 0;
} 