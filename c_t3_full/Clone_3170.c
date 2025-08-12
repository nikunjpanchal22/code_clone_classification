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

#define RET_FAIL 4
#define RET_OK 0

long loadFile(FILE *file, long *errcount);

int main(int argc, char **argv) {
      FILE *fp;
      char delimiter;
      long errcount = 0;
      long lines = 0;
      if(argc != 3) {
        printf("Usage: %s csvfilepath delimiter\n", argv[0]);
        return RET_FAIL;
      }
      if((delimiter = argv[2][0]) == '\0') {
        perror("delimiter must be specified");
        return RET_FAIL;
      }
      fp = fopen(argv[1], "r");
      if(fp == NULL) {
        perror("Error opening the file");
        return RET_FAIL;
      }
      lines = loadFile(fp, &errcount);
      fclose(fp);
      printf("Processed %ld lines, encountered %ld error(s)\n", lines, errcount);
      if(errcount > 0)
        return RET_FAIL;
      return RET_OK;
}


