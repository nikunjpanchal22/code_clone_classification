int main () {
    const char *src = "0011223344";
    char buffer [5];
    char *dst = buffer;
    char *end = buffer + sizeof (buffer);
    unsigned int u;
    while (dst < end && sscanf (src, "%2x", &u) == 1) {
        *dst++ = u;
        src += 2;
    }
    for (dst = buffer; dst < end; dst++)
        printf ("%d: %c (%d, 0x%02x)\n", dst -buffer, (isprint (*dst) ? *dst : '.'), *dst, *dst);
    return (0);
}


 int main () {
    const char *src = "0011223344";
    char buffer [5];
    int i = 0;
    char *dst = buffer;
    int d, u;
    while (src[i+2] != '\0') {
        sscanf(&src[i], "%2x", &u);
        d = (char)u;
        *dst++ = d;
        i+=2;
    }
    for (int i = 0; i < 5; i++){
        printf ("%d: %c (%d, 0x%02x)\n", i, (isprint (buffer[i]) ? buffer[i] : '.'), buffer[i], buffer[i]);
    }
    return (0);
}


