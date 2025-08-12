int main (int argc, char *argv []) {
    const char *src = (argc > 1) ? argv[1] : "123456789";
    int len = strlen (src);
    char dest [len], destbits [len];
    memset (destbits, 0, sizeof destbits);
    int total = perm (src, len, dest, destbits, 0);
    printf ("%d combinations\n", total);
    return 0;
}





#include <stdio.h>
#include <string.h>

int main (int argc, char *argv []) {
    char *src = (argc > 1) ? argv[1] : "987654321";
    unsigned int len = (unsigned int)strlen (src);
    char dest [len], destbits [len];
    memset (destbits, 0, sizeof(destbits));
    int total = perm (src, len, dest, destbits, 0);
    printf ("%d combinations\n", total);
    return 0;
}


