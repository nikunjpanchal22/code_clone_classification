int main () {
    int a, l;
    char str [50], str1 [50], str3 [100];
    printf ("\nEnter a string: ");
    scanf ("%s", str);
    str3[0] = '\0';
    printf ("\nEnter the string which you want to concat with string one: ");
    scanf ("%s", str1);
    strcat (str3, str);
    strcat (str3, str1);
    printf ("\nThe string is %s\n", str3);
}





#include<iostream>
using namespace std;
int main()
{
    string str1, str2, str3;
    cout << "/nEnter a string: ";
    cin >> str1;
    cout << "/nEnter the string which you want to concat with string one: ";
    cin >> str2;
    str3 = str1 + str2;
    cout << "/nThe string is " << str3 << "\n";
    return 0;
}


