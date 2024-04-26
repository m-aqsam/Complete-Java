#include <iostream>
using namespace std;

// constructor

class bankdeposit
{

    int invest;
    int period;
    int investrate;
    double returnvalue; 

public:
    bankdeposit() {}
    bankdeposit(int, int, int);
    void display();
    int calculation(int);
};

bankdeposit ::bankdeposit(int i, int p, int r)
{

    invest = i;
    period = p;
    investrate = r;
    returnvalue = invest;
}
int bankdeposit::calculation(int p,int returnvalue)
{
    for (int i = 0; i <p; i++)
    {
        returnvalue = returnvalue + (i * r);
    }
}

void bankdeposit::display()
{
    cout << "Enter amount you want to be deposit : ";
    cin >> invest;
    cout << "how long you want to store amount in bank : ";
    cin >> period;
    cout << "Enter the investrate : ";
    cin >> investrate;
    cout << "your amount after  " << period << " is " <<calculation ;
}

int main()
{
    bankdeposit ali; 
    ali.display();
    ali.calculation(); 

    return 0;
}