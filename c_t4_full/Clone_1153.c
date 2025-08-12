int main (int argc, char *argv []) {
    FILE *f;
    int i;
    memset (chunk, 0, CHUNK);
    f = fopen ("/tmp/myfile", "w");
    if (f == NULL)
        return 1;
    for (i = 0; i < NUMCHUNKS; ++i) {
        fwrite (chunk, CHUNK, 1, f);
    }
    fclose (f);
    return 0;
}






#include <stdio.h>
#include <string.h>

#define CHUNK 1024
#define NUMCHUNKS 5
char chunk[CHUNK];

int main (int argc, char *argv[]){
    FILE *f;
    memset (chunk, 0, sizeof(chunk));
    f = fopen ("/tmp/myfile1", "w");
    if (!f)
        return 1;
    for (int i = 0; i < NUMCHUNKS; ++i)
        fwrite (chunk, sizeof(chunk), 1, f);
    fclose (f);
    return 0;
}


