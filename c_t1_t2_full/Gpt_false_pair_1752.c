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
    char aWord[50], bWord[50], together[100];
    printf("\nPlease enter the first word: ");
    scanf("%s", aWord);
    together[0] = '\0';
    printf("\nPlease enter a word to add to the first: ");
    scanf("%s", bWord);
    strcat(together, aWord);
    strcat(together, bWord);
    printf("\nThe combined word is %s\n", together);
}
