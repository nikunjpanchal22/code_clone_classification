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


 int main (int argc, char *argv[]) {
	  char *file1, *file2, *file3;
	  long num = 0;
	  
	  if (argc > 1) {
	    const size_t s1 = strlen(argv[1]);
	    file1 = malloc(s1 + 1);
	    strncpy(file1, argv[1], s1);
	  }
	  if (argc > 2) {
	    const size_t s2 = strlen(argv[2]);
	    file2 = malloc(s2 + 1);
	    strncpy(file2, argv[2], s2);
	  }
	  if (argc > 3) {
	    const size_t s3 = strlen(argv[3]);
	    file3 = malloc(s3 + 1);
	    strncpy(file3, argv[3], s3);
	  }
	  if (argc > 4) {
	    num = strtol(argv[4], NULL, 0);
	  }
}


