#include <iostream>
using namespace std;

class employee;

class calculator
{
public:
    int sumcomplex(int a, int b)
    {
        return a+b; 
    }
    
};

class Employee
{

private:
    int a, b;
    friend int calculator ::sumcomplex(int a , int b);  

public:
    void printnum(int a, int b)
    {
        cout << "your num is " << a << " + " << b << "i" << endl;
    }
};



int main()
{
    Employee dig;
    dig.printnum(2, 4);
    dig.printnum(5, 6);
    calculator a;
    a.sumcomplex(a,b); 

    return 0;
}