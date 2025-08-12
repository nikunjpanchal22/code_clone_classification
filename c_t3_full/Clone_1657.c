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
       int file_size1 = strlen(argv[1])+1;
       file1 = calloc(file_size1, sizeof(char));
       strcpy(file1, argv[1]);
   }
   if (argc > 2) {
       int file_size2 = strlen(argv[2])+1;
       file2 = calloc(file_size2, sizeof(char));
       strcpy(file2, argv[2]);
   }
   if (argc > 3) {
       int file_size3 = strlen(argv[3])+1;
       file3 = calloc(file_size3, sizeof(char));
       strcpy(file3, argv[3]);
   }
   if (argc > 4) {
       num = atol(argv[4]);
   }
}


