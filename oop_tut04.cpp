#include <iostream>
using namespace std;

class discount
{
private:
    double price, disc;
   

public:
    void input(void);
     void calculation(void); 
    void paid(void);
    
};

void discount ::input(void)
{
    cout << "Enter the price of product " << endl;
    cin >> price;
    cout << "Enter the discount you want  " << endl;
    cin >> disc;
}

void discount ::calculation(void)
{

    double total = disc / 100 * price;
    cout << "The amount after " << disc << " % discount is " << total << endl;
}

void discount::paid(void)
{
    

    double total = disc / 100 * price;
    double paid = price - total;
    cout << "The amount paid by customer is " << paid;    
}


int main()
{
    discount shoes;
    shoes.input();
    shoes.calculation(); 
    shoes.paid();
    

    return 0;
}