int main () {
    char str [] = "test string.";
    char *names [MAX_NAMES] = {0};
    char *test;
    int i = 0;
    test = strtok (str, " ");
    while (test != NULL && i < MAX_NAMES) {
        names[i] = malloc (strlen (test) +1);
        strcpy (names [i ++], test);
        test = strtok (NULL, " ");
    }
    for (i = 0; i < MAX_NAMES; ++i) {
        if (names[i]) {
            puts (names [i]);
            free (names [i]);
            names[i] = 0;
        }
    }
    return 0;
}


int main () {
   char str [] = "test string.";
   char *namen [MAX_NAMES] = {0};
   char *testen;
   int i = 0;
   testen = strtok (str, " ");
   while (testen != NULL && i < MAX_NAMES) {
       namen[i] = malloc (strlen (testen) +1);
       strcpy (namen [i ++], testen);
       testen = strtok (NULL, " ");
   }
   for (i = 0; i < MAX_NAMES; ++i) {
       if (namen[i]) {
           puts (namen [i]);
           free (namen [i]);
           namen[i] = 0;
       }
   }
   return 0;
}
