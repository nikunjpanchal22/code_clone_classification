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
    char aSet[50], bSet[50], linked[100];
    printf("\nInput first set of characters: ");
    scanf("%s", aSet);
    linked[0] = '\0';
    printf("\nInput second set of characters to be linked to the first: ");
    scanf("%s", bSet);
    strcat(linked, aSet);
    strcat(linked, bSet);
    printf("\nThe joined string is %s\n", linked);
}
