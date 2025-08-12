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
    int a, len;
    char str [50], str1 [50], str3 [100];
    printf ("\nEnter a string: ");
    scanf ("%s", str);
    len = strlen(str);
    a = 0;
    while (str[a] != '\0') {
        str3[a] = str[a];
        a++;
    }
    printf ("\nEnter the string which you want to concat with string one: ");
    scanf ("%s", str1);
    while (str1[a] != '\0') {
        str3[len] = str1[a];
        a++;
        len++;
    }
    str3[len] = '\0';
    printf ("\nThe string is %s\n", str3);
    return 0; 
}


