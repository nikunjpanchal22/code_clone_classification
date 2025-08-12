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
   char input [41];
   char evenLett [21];
   char oddLett [21];
   int i = 0;
   int j = 0;
   int k = 0;
   printf ("Please enter a string of up to 40 characters: ");
   scanf ("%s", input);
   while (i < strlen (input)) {
       if (i % 2 == 0) {
           evenLett[j++] = input[i];
       }
       else {
           oddLett[k++] = input[i];
       }
       i++;
   }
   evenLett[j] = '\0';
   oddLett[k] = '\0';
   printf ("The even letters are: %s\n", evenLett);
   printf ("The odd letters are: %s\n", oddLett);
   return 0;
}
