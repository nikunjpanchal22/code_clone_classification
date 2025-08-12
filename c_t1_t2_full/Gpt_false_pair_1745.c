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
    char partA[50], partB[50], bothParts[100];
    printf("\nEnter the first portion of the string: ");
    scanf("%s", partA);
    bothParts[0] = '\0';
    printf("\nEnter the second portion of the string: ");
    scanf("%s", partB);
    strcat(bothParts, partA);
    strcat(bothParts, partB);
    printf("\nHere is the full string: %s\n", bothParts);
}
