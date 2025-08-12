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

#define RET_FAIL -1
#define RET_OK 1

long loadFile(FILE *file, long *errcount);

int main(int argc, char **argv) {
      FILE *fp;
      char delim;
      long errcount = 0l;
      long lines = 0l;
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
        fprintf(stderr, "Error opening the file: %d\n", errno);
        return RET_FAIL;
      }
      lines = loadFile(fp, &errcount);
      fclose(fp);
      printf("Processed %ld lines, encountered %ld error(s)\n", lines, errcount);
      if(errcount > 0)
        return RET_FAIL;
      return RET_OK;
}


