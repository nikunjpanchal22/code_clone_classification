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
    int buffer [5];
    int i = 0;
    int *dst = buffer;
    int d;
    while (src[i] != '\0') {
        sscanf(&src[i], "%2x", &d);
        *dst++ = d;
        i+=2;
    }
    for (int *dst = buffer; dst - buffer < 5; dst++)
        printf("%d: %c (%d, 0x%02x)\n", dst-buffer, (isprint (*dst) ? *dst : '.'), *dst, *dst);
    return (0);
}


