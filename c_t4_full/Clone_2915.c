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
    fgets(str, sizeof(str), stdin);
    fgets(str1, sizeof(str1), stdin);
    str[strcspn(str, "\n")] = 0;
    str1[strcspn(str1, "\n")] = 0;
    printf("\nThe string is %s\n", strcat(str, str1));
}


