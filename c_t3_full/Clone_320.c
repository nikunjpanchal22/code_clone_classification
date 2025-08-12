int main (void) {
    setlocale (LC_ALL, "Portuguese");
    char ok_decimal_point = localeconv ()->decimal_point[0];
    char bad_decimal_point = (ok_decimal_point == '.') ? ',' : '.';
    float val;
    char str [20] = "123.456";
    for (int i = 0; str[i] != '\0'; ++i) {
        if (str[i] == bad_decimal_point) {
            str[i] = ok_decimal_point;
        }
    }
    val = strtof (str, NULL);
    printf ("String value = %s, Float value = %f\n", str, val);
    return (0);
}


 int main (void) {
    setlocale (LC_ALL, "Portuguese");
    float val;
    char str [20] = "123.456";
    char *ptr = strchr(str, '.');
    if (ptr == NULL) {
        for (int i = 0; str[i] != '\0'; ++i) {
            if (str[i] == ',') {
                str[i] = '.';
                break;
            }
        }
    }
    val = strtof (str, NULL);
    printf ("String value = %s, Float value = %f\n", str, val);
    return (0);
}


