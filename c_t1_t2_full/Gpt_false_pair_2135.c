int main (void) {
    char str [41];
    char odd [21];
    char even [21];
    int i = 0;
    int j = 0;
    int k = 0;
    printf ("Enter a string (40 characters maximum): ");
    scanf ("%s", str);
    while (i < strlen (str)) {
        if (i % 2 == 0) {
            odd[j++] = str[i];
        }
        else {
            even[k++] = str[i];
        }
        i++;
    }
    odd[j] = '\0';
    even[k] = '\0';
    printf ("The even string is:%s\n ", even);
    printf ("The odd string is:%s\n ", odd);
    return 0;
}



 
int main (void) {
   char words [41];
   char evenNum [21];
   char oddNum [21];
   int i = 0;
   int j = 0;
   int k = 0;
   printf ("Enter some words (up to 40 characters): ");
   scanf ("%s", words);
   while (i < strlen (words)) {
       if (i % 2 == 0) {
           evenNum[j++] = words[i];
       }
       else {
           oddNum[k++] = words[i];
       }
       i++;
   }
   evenNum[j] = '\0';
   oddNum[k] = '\0';
   printf ("The even letters are: %s\n", evenNum);
   printf ("The odd letters are: %s\n", oddNum);
   return 0;
}
