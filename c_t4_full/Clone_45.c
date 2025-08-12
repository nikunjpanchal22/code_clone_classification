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
    char buf[200];
    char bytearray[100];
    printf("enter string :\n");
    fgets(buf, 200, stdin);
    size_t str_len = strlen(buf);
    int k = 0;
    for (size_t j = 0; j < (str_len - 1); j = j + 2, k++) {	
        bytearray[k] = converttohex(&buffer[j]);		
        printf(" %02X", bytearray[k]);
    }
}


