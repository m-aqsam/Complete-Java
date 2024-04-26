#include <iostream>
#include <string>
using namespace std;

class binary
{
private:
    string s;
    void check_bin(void);

public:
    void read(void);

    void ones_compliment(void);
    void display(void);
};
void binary ::read(void)
{
    cout << "Enter your number : " << endl;
    cin >> s;
}

void binary ::check_bin(void)
{
    for (int i = 0; i < s.length(); i++)
    {
        if (s.at(i) != '0' && s.at(i) != '1')
        {
            cout << "please ! Enter correct binary format . " << endl;
            exit(0);
            cout << endl;
        }
    }
}

void binary ::ones_compliment(void)
{
    check_bin(); /*--> Nesting of memeber funtion .( Recal a private function
                         within a function )           */

    for (int i = 0; i < s.length(); i++)
    {
        if (s.at(i) == '0')
        {
            s.at(i) = '1';
        }
        else
        {
            s.at(i) = '0';
        }
    }
}

void binary ::display(void)
{
    cout << "Display your Binary number : " << endl;
    for (int i = 0; i < s.length(); i++)
    {

        cout << s.at(i);
    }
    cout << endl;
}

int main()
{
    binary b;
    b.read();
    // b.check_bin();        --> Error ! ceck-bin is private .
    b.display();
    b.ones_compliment();
    b.display();

    return 0;
}