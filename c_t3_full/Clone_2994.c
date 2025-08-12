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



#include <stdio.h>
#include <string.h>
int main() {
 char str[50], str2[50], resultant[100];
 printf("Enter first string:\n");
 gets(str);
 printf("Enter second string:\n");
 gets(str2);
 strcpy(resultant, str);
 strcat(resultant, str2);
 printf("Resultant string is: %s\n", resultant);
 return 0;
}


