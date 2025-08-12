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
int main(){
    char s1[50], s2[50];
    printf("Enter a string: ");
    scanf("%s",s1);
    printf("Enter a string: ");
    scanf("%s",s2);
    printf("%s\n",strcat(s1, s2));
    return 0;
}


