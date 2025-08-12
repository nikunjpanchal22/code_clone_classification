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





#include <iostream>
#include <string>
using namespace std;
int main ()
{
  string s1, s2, s3;
  cout << "Enter first string: ";
  cin >> s1;
  cout << "Enter second string: ";
  cin >> s2;
  s3 = s1.append(s2);
  cout << "The new string is: " << s3 << endl;
  return 0;
}


