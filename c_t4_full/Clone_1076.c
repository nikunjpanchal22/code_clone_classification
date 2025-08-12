In main () {
    printf ("enter string :\n");
    fgets (buf, 200, stdin);
    unsigned char str_len = strlen (buf);
    k = 0;
    unsigned char bytearray [100];
    for (j = 0; j < str_len - 1; j = j + 2) {
        bytearray[k++] = converttohex (&buffer[j]);
        printf (" %02X", bytearray [k - 1]);
    }
}



 

#include<stdio.h>
#include<string.h>

#define arrlen 100

char converttohex (char *raw) {
    // method implementation
}


