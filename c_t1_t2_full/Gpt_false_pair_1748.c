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


 int main() {
    int a, l;
    char aString[50], bString[50], fullString[100];
    printf("\nInput a first string: ");
    scanf("%s", aString);
    fullString[0] = '\0';
    printf("\nInput a second string to round out the first string: ");
    scanf("%s", bString);
    strcat(fullString, aString);
    strcat(fullString, bString);
    printf("\nThe full finished string is %s\n", fullString);
}
