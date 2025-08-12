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
int main()
{
    char str1[50], str2[50], str3[100];
    printf("/nEnter first string: ");
    scanf("%s",str1);
    printf("/nEnter second string: ");
    scanf("%s",str2);
    sprintf(str3, "%s%s", str1, str2);
    printf("/nThe combined string is %s\n",str3);
    return 0;
}


