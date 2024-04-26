#include <iostream>
using namespace std;

// function overloading :

int sum(int a, int b)
{

    return a + b;
}

int sum(int a, int b, int c)
{
    return a + b + c;
}

int main()
{ 

    int a, b, c;

    cout << "The sum of a and b is : " << sum(4,6)<<endl; 
    cout << "The sum of a,b and c is : " << sum(5,10,3);

    return 0;
}