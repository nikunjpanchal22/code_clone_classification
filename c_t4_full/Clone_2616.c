int main (int argc, char **argv) {
    char c;
    FILE *fp;
    if (argc < 2) {
        printf ("Usage : ./a.out <filename>");
        exit (0);
    }
    fp = fopen (argv[1], "w");
    while ((c = getchar ()) != EOF) {
        putc (c, fp);
    }
    return 0;
}





#include<string.h>
#define MAX 100
int main(int argc, char *argv[])
        {
        char s[MAX];
        if(argc != 2)
        {
        printf("usage: ./a.out <filename>");
        exit(EXIT_FAILURE);
        }
        FILE *fp=NULL;
        fp = fopen (*(argv+1) , "w");
        if(NULL == fp)
        {
        printf("\n fopen () Error!!!\n");
        return 1;
        }
        while(fgets(s, MAX, stdin))
        { 
        fputs(s, fp);
        }
        return 0;
}


