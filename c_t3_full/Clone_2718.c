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
        printf ("Failure in creating file, errno = %d\n", errno);
        return 1;
    }
    fclose (file);
    printf ("File successfully created.");
    return 0;
}


