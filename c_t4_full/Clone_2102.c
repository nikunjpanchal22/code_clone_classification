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

#define PATH_MAX 1024
#define CHUNK 128
char cmd[PATH_MAX];
char result[CHUNK];

int main(int argc, char *argv[])
{
    int i;
    
    for(i = 1; i<argc; i++)
    {
        FILE *fp = NULL;
        sprintf(cmd, "file '%s'", argv[i]);
        fp = popen(cmd, "r");
        if(fp != NULL) 
        {
            while (fgets(result, sizeof(result), fp) != NULL)
            {
                fputs(result, stdout);
            }
            pclose(fp);
        }
        else
        {
            perror("popen");
        }
    }    
    
    return 0;
}


