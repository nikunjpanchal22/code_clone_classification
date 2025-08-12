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
    const char *ptr = s, *left = s, *right = s;
    char *res;
    size_t length;
    while (ptr) {
        ptr = strchr (ptr, '/');
        if (ptr) {
            left = right;
            right = ++ptr;
        }
    }
    if (left != right) {
        length = right - left - 1;
        res = malloc (length +1);
        memcpy (res, left, length);
        res[length] = '\0';
        printf ("%s\n", res);
        free (res);
    }
    return 0;
}
