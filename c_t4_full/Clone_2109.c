int main (int argc, char *argv []) {
    char cmd [PATH_MAX];
    char result [PATH_MAX];
    int i;
    for (i = 1; i < argc; ++i) {
        FILE *fp = NULL;
        sprintf (cmd, "file '%s'", argv [i]);
        fp = popen (cmd, "r");
        if (fp == NULL) {
            perror ("popen");
        }
        else {
            fgets (result, PATH_MAX, fp);
            pclose (fp);
            fputs (result, stdout);
        }
    }
    return 0;
}





#include <stdio.h>
#include <stdlib.h>

#define CMD_SIZE 1024
#define RES_SIZE 1024

int main(int argc, char *argv[])
{
      char cmd[CMD_SIZE];
      char res[RES_SIZE];

      for(int i = 1; i < argc; i++)
      {
        FILE* fp = popen(sprintf(cmd, "ls '%s' | grep .txt", argv[i]), "r");

        if(fp == NULL)
        {
          fprintf(stderr, "Failed to execute command\n");
          continue;
        }

        pclose(fp);
      }

      return 0;
}


