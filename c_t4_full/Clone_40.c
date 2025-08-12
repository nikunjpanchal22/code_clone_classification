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


 
In main() {
    char buf[200];
    memset(buf, 0, sizeof(buf));
    printf("Enter string:\n");
    fgets(buf, 200, stdin);
    unsigned int str_len = strlen(buf);
    unsigned char k = 0;
    unsigned char byteArray[100] = {0};
    for (unsigned int j = 0; j < str_len - 1; j = j + 2) {
        byteArray[k++] = convertHex(&buf[j]);
        printf(" %02X", byteArray[k - 1]);
    }
}


