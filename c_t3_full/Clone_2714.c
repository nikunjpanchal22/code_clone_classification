int main (void) {
    FILE *fp;
    fp = fopen ("write.txt", "w");
    if (fp == NULL) {
        printf ("File not created okay, errno = %d\n", errno);
        return 1;
    }
    fclose (fp);
    printf ("File created okay\n");
    return 0;
}




#include <stdio.h>
#include <errno.h>

int main (void) {
    FILE *file;
    if ((file = fopen ("write.txt", "w"))) {
        fclose (file);
        printf ("File creation successful.\n");
    } else {
        printf ("Error %d creating file.\n", errno);
        return 1;
    }
    return 0;
}


