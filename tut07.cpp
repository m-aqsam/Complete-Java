#include<iostream>
using namespace std;

// Table : 

int main(){

double n,table;

    cout<<"Enter the digit you wantr table : ";  
    cin>>n;

    for (int i = 1; i <=10; i++)
    {
        table=n*i;
      cout<<n<<" * "<<i<<" = "<<table<<endl; 
    }
    



    return 0;
}