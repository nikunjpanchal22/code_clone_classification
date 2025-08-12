int main () {
    static const char hello [] = "hello\n";
    clock_t start = clock ();
    for (int i = 0; i < 2000000; i++)
        cout << hello;
    clock_t end = clock ();
    cerr << "Time elapsed " << ((double) end - start) / CLOCKS_PER_SEC << endl;
    return 0;
}




pp
#include <iostream>
#include <ctime>
using namespace std;
int main () {
    static const char hello [] = "hello\n";
    clock_t start = clock ();
    int i = 0;
    while (i < 2000000){
        cout << hello;
        i++;
    }
    clock_t end = clock ();
    cerr << "Time elapsed " << ((double) end - start) / CLOCKS_PER_SEC << endl;
    return 0;
}


