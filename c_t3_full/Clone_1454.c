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
    int i = 0;
    while (str[i] != '\0') {
        str3[i] = str[i];
        i++;
    }
    printf ("\nEnter the string which you want to concat with string one: ");
    scanf ("%s", str1);
    for(a = 0; str1[a] != '\0'; a++) {
        str3[i + a] = str1[a];
    }
    str3[i + a] = '\0';
    printf ("\nThe string is %s\n", str3);
    return 0;
}


