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

#define CMD_LEN 256
#define RES_LEN 256
int main(int argc, char *argv[])
{
      char cmd[CMD_LEN];
      char res[RES_LEN];

      for(int i = 1; i < argc; i++)
      {
        if(snprintf(cmd, sizeof(cmd), "file '%s'", argv[i]) >= sizeof(cmd))
        {
          fprintf(stderr, "Filename too large\n");
          continue;
        }

        FILE* fp = popen(cmd, "r");

        if(fp == NULL)
        {
          perror("popen");
          continue;
        }

        if(fgets(res, sizeof(res), fp) == NULL)
          perror("fgets");

        pclose(fp);

        fputs(res, stdout);
      }

      return 0;
}


