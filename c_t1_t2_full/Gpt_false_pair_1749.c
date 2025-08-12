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
   char word[50], word1[50], combinedWord[100];
   printf("\nInput first word: ");
   scanf("%s", word);
   combinedWord[0] = '\0';
   printf("\nInput a word to append to the first word: ");
   scanf("%s", word1);
   strcat(combinedWord, word);
   strcat(combinedWord, word1);
   printf("\nThe new composed word is %s\n", combinedWord);
}
