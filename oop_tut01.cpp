#include <iostream>
using namespace std;

class students
{
private:
    int a, b, c;

public:
    int d, e;

    void setData(int a, int b, int c);
    void getData(int d, int e);
};

void students::setData(int a1, int b1, int c1) // -->  change a to a1 due to 33=a1 & a1=a the a which is
                                               // private */
{
    a = a1;
    b = b1;
    c = c1;
}

void students ::getData(int d, int e)
{

    cout << "The value of a is :" << a << endl;
    cout << "The value of b is :" << b << endl;
    cout << "The value of c is :" << c << endl;
    cout << "The value of d is :" << d << endl;
    cout << "The value of e is :" << e << endl;
}

int main()
{
    students ali;
    // ali.d = 31;
    // ali.e = 85;

    ali.setData(33, 3, 5);
    ali.getData(31, 85);

    return 0;
}