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


int main () {
    char buf[200];
    unsigned char k = 0, j;
    unsigned char bytearray [100];

    printf ("enter string :\n");
    fgets (buf, sizeof(buf), stdin);
    unsigned char str_len = strlen (buf);

    for (j = 0; j < str_len - 1; j += 2) {
        bytearray[k++] = converttohex (&buf[j]);
        printf (" %02X", bytearray [k - 1]);
    }

    return 0;
}


