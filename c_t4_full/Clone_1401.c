int main (int argc, char **argv) {
    int g [MAXP] = {0}, a [MAXP] = {0}, n = 0;
    char *names [MAXP] = {NULL};
    FILE *fp = argc > 1 ? fopen (argv[1], "r") : stdin;
    if (!fp) {
        fprintf (stderr, "error: file open failed '%s'.\n", argv [1]);
        return 1;
    }
    n = readfp (fp, g, a, names, MAXP);
    if (fp != stdin)
        fclose (fp);
    if (n)
        for (int i = 0; i < n; i++) {
            printf ("%-30s %8d %8d\n", names [i], g [i], a [i]);
            free (names [i]);
        }
    return 0;
}





#include <stdio.h>

#define MAXP 10

int main (int argc, char **argv){
	    int i, g[MAXP] = {0}, a[MAXP] = {0}, n = 0;
	    char *names[MAXP];
	    FILE *file;
	    file = fopen(argv[1], "r");
	    if (file == NULL){
		printf("Error opening file! \n");
		exit(1);
	    }
	    fclose(file);
	    return 0;
}


