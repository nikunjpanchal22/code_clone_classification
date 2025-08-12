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
    int len1, len2;
    char str[50], str1[50], str3[100];
    printf("Enter a string: ");
    scanf("%s", str);
    len1 = strlen(str);
    printf("\nEnter the string which you want to append with string one: ");
    scanf("%s", str1);
    len2 = strlen(str1);
    printf("\nThe string is: ");
    // concat string
    for (int i = 0; i < len1; i++) 
        str3[i] = str[i]; 
    for (int i = 0; i < len2; i++) 
        str3[len1 + i] = str1[i];
    str3[len1 + len2] = '\0'; 
    printf("%s\n", str3); 
    return 0;
}


