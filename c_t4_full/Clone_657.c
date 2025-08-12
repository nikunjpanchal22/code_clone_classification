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
    int a, l;
    l = 0;
    char str [50], str1 [50], str3 [100];
    printf ("\nEnter a string: ");
    scanf ("%s", str);
    while (str[l] != '\0') {
        str3[l] = str[l];
        l++;
    }
    printf ("\nEnter the string which you want to concat with string one: ");
    scanf ("%s", str1);
    a = 0;
    while (str1[a] != '\0') {
        str3[l + a] = str1[a];
        a++;
    }
    str3[l + a] = '\0';
    printf ("\nThe string is %s\n", str3);
    return 0;
}


