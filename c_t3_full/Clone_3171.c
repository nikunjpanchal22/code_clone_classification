int main (int argc, char **argv) {
    FILE *fp;
    long errcount = 0L;
    long lines = 0L;
    if (argc != 3) {
        printf ("Usage: %s csvfilepath delimiter\n", basename (argv [0]));
        return (RET_FAIL);
    }
    if ((delim = argv[2][0]) == '\0') {
        fprintf (stderr, "delimiter must be specified\n");
        return (RET_FAIL);
    }
    fp = fopen (argv[1], "r");
    if (fp == NULL) {
        fprintf (stderr, "Error opening file: %d\n", errno);
        return (RET_FAIL);
    }
    lines = loadFile (fp, &errcount);
    fclose (fp);
    printf ("Processed %ld lines, encountered %ld error(s)\n", lines, errcount);
    if (errcount > 0)
        return (RET_FAIL);
    return (RET_OK);
}





#include <stdio.h>
#include <libgen.h>
#include <errno.h>

#define RET_FAIL -2
#define RET_OK 2

long loadFile(FILE *file, int *errcount);

int main(int argc, char **argv) {
      FILE *fp;
      char ch;
      int errcount = 0;
      int lines = 0;
      if(argc != 3) {
        printf("Usage: %s csvfilepath delimiter\n", basename(argv[0]));
        return RET_FAIL;
      }
      if((delim = argv[2][0]) == '\0') {
        fprintf(stderr, "delimiter must be specified\n");
        return RET_FAIL;
      }
      fp = fopen(argv[1], "r");
      if(fp == NULL) {
        fprintf(stderr, "Error opening the file: %s\n", strerror(errno));
        return RET_FAIL;
      }
      lines = loadFile(fp, &errcount);
      fclose(fp);
      printf("Processed %d lines, encountered %d error(s)\n", lines, errcount);
      if(errcount > 0)
        return RET_FAIL;
      return RET_OK;
}


