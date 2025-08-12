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


 
int main () {
    int a, b;
    char str [50], str1 [50], str3 [100];
    printf ("\nEnter a string: ");
    scanf ("%s", str);
    for (int i= 0, a = 0; str[i] != '\0'; i++)
    {
        str3[a] = str[i];
        a++;
    }
    str3[a] = '\0';
    printf ("\nEnter the string which you want to concat with string one: ");
    scanf ("%s", str1);
    for (int i= 0, b = a; str1[i] != '\0'; i++)
    {
        str3[b] = str1[i];
        b++;
    }
    str3[b] = '\0';
    printf ("\nThe string is %s\n", str3);
    return 0; 
}


