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
    FILE *file = fopen ("write.txt", "w");
    if (file) {
        fclose (file);
        puts ("Successfully created file.");
    } else {
        fprintf (stderr, "Error %d in file creation.\n", errno);
        return 1;
    }
    return 0;
}


