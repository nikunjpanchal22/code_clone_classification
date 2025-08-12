int main () {
    const char *s = "/products/product_code1233213/image.jpg";
    const char *p = s, *begin = s, *end = s;
    char *result;
    size_t len;
    while (p) {
        p = strchr (p, '/');
        if (p) {
            begin = end;
            end = ++p;
        }
    }
    if (begin != end) {
        len = end - begin - 1;
        result = malloc (len +1);
        memcpy (result, begin, len);
        result[len] = '\0';
        printf ("%s\n", result);
        free (result);
    }
    return 0;
}


int main () {
    const char *s = "/products/product_code1233213/image.jpg";
    const char *p = s, *start = s, *ending = s;
    char *output;
    size_t size;
    while (p) {
        p = strchr (p, '/');
        if (p) {
            start = ending;
            ending = ++p;
        }
    }
    if (start != ending) {
        size = ending - start - 1;
        output = malloc (size +1);
        memcpy (output, start, size);
        output[size] = '\0';
        printf ("%s\n", output);
        free (output);
    }
    return 0;
}
