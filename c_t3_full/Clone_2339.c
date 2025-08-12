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
    char *source = "66778899AA";
    char tmp [5], *tgt = tmp, *endpt = tmp + sizeof (tmp);
    unsigned int x;
    while (tgt < endpt && sscanf (source, "%2x", &x) == 1) {
        *tgt++ = x;
        source += 2;
    }
    while (tgt < endpt) *tgt++ = '\0';
    return (0);
}


