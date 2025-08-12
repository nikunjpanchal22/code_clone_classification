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
    char aPortion[50], bPortion[50], resultant[100];
    printf("\nInput the first portion of the string: ");
    scanf("%s", aPortion);
    resultant[0] = '\0';
    printf("\nInput a portion to link to the first: ");
    scanf("%s", bPortion);
    strcat(resultant, aPortion);
    strcat(resultant, bPortion);
    printf("\nThe combined string is %s\n", resultant);
}
