
#include<iostream>
using namespace std;

/*call by refrence using pointers :
* --> (value at)
& --> (adrees of variable
*/

void swap(int *a , int *b){
int temp=*a;
*a=*b;
*b=temp;

}

//call by refrence using c++ pointers

void swaprefrenceVr(int &a, int &b){

int temp=a;
a=b;
b=temp;

}


int main(){
 int a=4; int b=5;

//cout<<"The value of a is "<<a<<" The value of b is "<<b<<endl;  
//swap(&a,&b); 
//cout<<"The value of a is "<<a<<" The value of b is "<<b<<endl<<endl;

//call by refrence using c++ refrence

cout<<"The value of a is "<<a<<" The value of b is "<<b<<endl; 
swaprefrenceVr(a,b);
cout<<"The value of a is "<<a<<" The value of b is "<<b<<endl; 



    return 0;
}