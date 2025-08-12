int main (int argc, char *argv []) {
    char *file1, *file2, *file3;
    long num = 0;
    if (argc > 1) {
        file1 = malloc (strlen (argv[1]) + 1);
        strcpy (file1, argv [1]);
    }
    if (argc > 2) {
        file2 = malloc (strlen (argv[2]) + 1);
        strcpy (file2, argv [2]);
    }
    if (argc > 3) {
        file3 = malloc (strlen (argv[3]) + 1);
        strcpy (file3, argv [3]);
    }
    if (argc > 4) {num = strtol (argv [4], NULL, 0);}
}


 int main (int argc, char *argv []) {
   char *file1, *file2, *file3;
   long num = 0;

   if (argc > 1) {
       int length1 = strlen (argv[1]);
       file1 = malloc (length1 + 1);
       strncpy (file1, argv [1], length1);
   }

   if (argc > 2) {
       int length2 = strlen (argv[2]);
       file2 = malloc (length2 + 1);
       strncpy (file2, argv [2], length2);
   }

   if (argc > 3) {
       int length3 = strlen (argv[3]);
       file3 = malloc (length3 + 1);
       strncpy (file3, argv [3], length3);
   }

   if (argc > 4) {
       char *endptr;
       num = strtol (argv [4], &endptr, 0);
   }
}


