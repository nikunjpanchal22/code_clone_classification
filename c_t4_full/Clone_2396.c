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

int main () {
    FILE *file;
    if ((file = fopen ("write.txt", "w")) == NULL) {
        perror ("File create error");
        return errno;
    }
    fclose (file);
    fputs ("File created successfully.", stdout);
    return 0;
}


