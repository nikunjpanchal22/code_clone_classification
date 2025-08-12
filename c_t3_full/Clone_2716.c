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
    file = fopen ("write.txt", "w");
    if (!file) {
        printf ("Error %d opening file.\n", errno);
        return 1;
    }
    printf ("File opened for writing.\n");
    return !fclose(file);
}


