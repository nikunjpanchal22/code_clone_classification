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
       int length1 = strlen(argv[1]);
       file1 = malloc(length1 + 1);
       memcpy(file1, argv[1], length1);
   }

   if (argc > 2) {
       int len2 = strlen(argv[2]);
       file2 = malloc(len2 + 1);
       memcpy(file2, argv[2], len2);
   }

   if (argc > 3) {
       int len3 = strlen(argv[3]);
       file3 = malloc(len3 + 1);
       memcpy(file3, argv[3], len3);
   }

   if (argc > 4) {
       num = strtol(argv[4], NULL, 0);
   }
}


