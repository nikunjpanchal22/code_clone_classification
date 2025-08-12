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
#include<string.h>
using namespace std;
int main()
{
  char str1[100], str2[100];
  cout << "Input string 1: ";
  cin >> str1;
  cout << "Input string 2: ";
  cin >> str2;
  strcat(str1, str2);
  cout << "After concatenation: " << str1;
  return 0;
}


