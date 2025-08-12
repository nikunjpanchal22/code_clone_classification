int main () {
    int n;
    char str [100] [100];
    scanf ("%d\n", & n);
    for (int i = 0; i < n; i++) {
        scanf ("%s", str [i]);
    }
    for (int i = 0; i < n; i++)
        printf ("%s\n", str[i]);
    getchar ();
    return 0;
}






#include <iostream>
#include <string>
using namespace std;
int main () {
    int n;
    string str [100];
    cin >> n;
    for (int i = 0; i < n; i++)
        cin >> str [i];
    for (int i = 0; i < n; i++)
        cout << str[i] << endl;
    cin.ignore();
    return 0;
}


