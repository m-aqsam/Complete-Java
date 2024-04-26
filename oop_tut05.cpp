#include <iostream>
using namespace std; 

class number
{
private:
    int a, b;

public:
    void setdata();
    int sum (int p,int q);
};

   void number::setdata() 
    {
        cout << "Enter first num : ";
        cin >>a;
        cout << "Enter second num : ";
        cin >>b;
        cout << "Sum of " << a << " and " << b << " is " << sum(a,b);   
    
    }

    int number::sum(int p, int q) 
    {
        a=p; 
        b=q;
        return (p+q);  
    }


int main()
{
    number t;
    t.setdata();  
     

    return 0;
}