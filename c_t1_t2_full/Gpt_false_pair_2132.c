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
   char phrases [41];
   char evenStr [21];
   char oddStr [21];
   int i = 0;
   int j = 0;
   int k = 0;
   printf ("Input a phrase of up to 40 characters: ");
   scanf ("%s", phrases);
   while (i < strlen (phrases)) {
       if (i % 2 == 0) {
           evenStr[j++] = phrases[i];
       }
       else {
           oddStr[k++] = phrases[i];
       }
       i++;
   }
   evenStr[j] = '\0';
   oddStr[k] = '\0';
   printf ("The string of even characters is: %s\n", evenStr);
   printf ("The string of odd characters is: %s\n", oddStr);
   return 0;
}
