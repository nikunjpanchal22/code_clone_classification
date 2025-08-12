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





#include<stdio.h>
#include<string.h>
int main(void)
{
    char first_string[50] = {'\0'};
    char second_string[50] = {'\0'};
    printf("Enter first string: ");
    scanf("%s", first_string);
    printf("Enter second string: ");
    scanf("%s", second_string);
    printf("Concatenated string is: %s\n", strcat(first_string, second_string));
    return 0;
}


