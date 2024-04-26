#include <iostream>
using namespace std;

// --------------------->    Constructor , Default arguments      <-----------------------

class simple
{
    int a, b, c;

public:
    void display();
    simple(int, int, int); // ---> Constructor
};

void simple ::display()
{
    cout << "Enter the value of  a ";
    cin >> a;
    cout << "Enter the value of  b ";
    cin >> b;
    cout << "Enter the value of  c ";
    cin >> c;
    cout << "The value of a,b and c is "<<a<<","<<b<<" and "<<c; 
}

 simple::simple(int x, int y, int z) // ----> Default arguments 
{
    a = x;
    b = y;
    c = z;
  
}

int main()
{
     simple c1(1,2,3); // --> argument should be given due to Constructor need an argument 
       c1.display();  //      to execute althouhg it does not have any impact on output.
     
   

    // simple c2;
    // c2.display();

    // simple c3;
    // c3.display();
    return 0;
}