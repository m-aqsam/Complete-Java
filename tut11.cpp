#include <iostream>
using namespace std;

class factorial
{
private:
    double f;

public:
    void input(void);
    void fact(void);
};
void factorial ::input(void)
{
    cout << "Enter your number " << endl;
    cin >> f;
}

void factorial ::fact(void)
{
    double fact = 1;
    for (int i = f; i >= 1; i--)
    {
        fact = fact * i; 
    }
    cout << "Factorial of " << f << " is " << fact;
}

int main()
{

    factorial f; 
    f.input();
    f.fact(); 

    return 0;
}

// 5!=5*4*3*2*1

/*     double f;
cout << "Enter your number ";
cin >> f;
double fact =1;
for (int i = f; i >= 1; i--)
{
    fact = fact * i;

}

cout<<"Factorial of "<<f<<" is "<<fact;


*/
