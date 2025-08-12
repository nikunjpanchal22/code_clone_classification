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
    char block[50], block1[50], combination[100];
    printf("\nPlease enter initial block of characters: ");
    scanf("%s", block);
    combination[0] = '\0';
    printf("\nPlease enter a block of characters to be added to the original: ");
    scanf("%s", block1);
    strcat(combination, block);
    strcat(combination, block1);
    printf("\nThe combined characters form %s\n", combination);
}
