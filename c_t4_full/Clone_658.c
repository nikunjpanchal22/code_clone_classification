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
    int len;
    char str[50], str1[50], str3[100];
    printf("Enter a string: ");
    scanf("%s", str);
    len = strlen(str);
    for (int i = 0; i < len; i++)
        str3[i] = str[i]; 
    printf("\nEnter the string which you want to concat with string one: ");
    scanf("%s", str1);
    int j = 0; 
    while (str1[j] != '\0') {
        str3[len] = str1[j];
        j++;
        len++;
    }
    str3[len] = '\0';
    printf("\nThe string is %s\n", str3); 
    return 0;
}


