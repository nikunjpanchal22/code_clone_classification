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
    int len1, len2, i;
    char str[50], str1[50], str3[100];
    printf("Enter a string: ");
    scanf("%s", str);
    len1 = strlen(str);
    for (i = 0; i < len1; i++) 
        str3[i] = str[i]; 
    printf("\nEnter the string which you want to append with string one: ");
    scanf("%s", str1);
    len2 = strlen(str1);
    while (len2 > 0) {
        str3[len1] = str1[len2 - 1];
        len2--;
        len1++;
    }
    str3[len1] = '\0'; 
    printf("\nThe string is: %s\n", str3); 
    return 0;
}


