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
    file = fopen ("write.txt", "w");
    if (file != NULL) {
        fclose (file);
        printf ("File created successfully.\n");
    } else {
        printf ("Failed to create file, error = %d\n", errno);
        return 1;
    }
    return 0;
}


