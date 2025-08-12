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
void main(){
   char str[50], str1[50];
   printf("Enter a string: ");
   gets(str);
   printf("Enter the string you want to concat: ");
   gets(str1);
   printf("\nThe string is %s\n", strcat(str, str1));
}


