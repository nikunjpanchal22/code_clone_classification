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
   char *namez [MAX_NAMES] = {0};
   char *testz;
   int i = 0;
   testz = strtok (str, " ");
   while (testz != NULL && i < MAX_NAMES) {
       namez[i] = malloc (strlen (testz) +1);
       strcpy (namez [i ++], testz);
       testz = strtok (NULL, " ");
   }
   for (i = 0; i < MAX_NAMES; ++i) {
       if (namez[i]) {
           puts (namez [i]);
           free (namez [i]);
           namez[i] = 0;
       }
   }
   return 0;
}
