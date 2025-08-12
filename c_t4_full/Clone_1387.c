int main (int argc, char **argv) {
    char buf [BUFFER_SIZE] = {0};
    char string [BUFFER_SIZE] = {0};
    size_t stridx = 0;
    if (argc < 2) {
        fprintf (stderr, "error: insufficient input. usage: %s filename", argv [0]);
        return 1;
    }
    FILE *fp = NULL;
    if (!(fp = fopen (argv[1], "r"))) {
        fprintf (stderr, "error: file open failed '%s'.\n", argv [1]);
        return 1;
    }
    while (fgets (buf, BUFFER_SIZE, fp))
        extractCaps (string, buf, &stridx);
    printf ("\nAll caps in file : %s\n\n", string);
    return 0;
}




pp
#define BUFFER_SIZE 2048
#include <ctype.h>
void extractCaps (char *outStr, char *inStr, size_t *outidx) {
    char *p;
    for(p = inStr; *p; ++p) 
        if(isupper(*p))
            outStr[(*outidx)++] = *p;
}


