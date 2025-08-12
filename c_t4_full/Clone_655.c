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
    int i, j;
    char str [50], str1 [50], str3 [100];
    printf ("\nEnter a string: ");
    scanf ("%s", str);
    i = 0;
    while (str[i] != '\0') {
        str3[i] = str[i];
        i++;
    }
    printf ("\nEnter the string which you want to concat with string one: ");
    scanf ("%s", str1);
    j = 0;
    while (str1[j] != '\0') {
        str3[i] = str1[j];
        i++;
        j++;
    }
    str3[i] = '\0';
    printf ("\nThe string is %s\n", str3);
    return 0;
}


