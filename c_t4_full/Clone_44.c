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



In main () {
    char buffer[200];
    memset(buffer, 0, sizeof(buffer));
    printf ("Enter string :\n");
    fgets(buffer, 200, stdin);
    unsigned int str_len = strlen(buffer);
    unsigned char k = 0;
    unsigned char bytesArray[100] = {0};
    for (unsigned int j = 0; j < str_len - 1; j = j + 2) {
        bytesArray[k++] = convertToHex(&buffer[j]);
        printf (" %02X", bytesArray[k - 1]);
    }
}


