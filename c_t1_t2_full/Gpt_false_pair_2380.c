int main (void) {
    int values [5];
    char *str = "14 22 33 48 5q";
    size_t converted;
    stringToIntList (str, values, sizeof values / sizeof values [0], & converted);
    if (converted > 0) {
        size_t i;
        printf ("Converted %lu items from \"%s\":\n", (unsigned long) converted, str);
        for (i = 0; i < converted; i++)
            printf ("arr[%lu] = %d\n", (unsigned long) i, arr[i]);
    }
    else {
        printf ("Could not convert any of \"%s\" to equivalent integer values\n", str);
    }
    return 0;
}


int main (void) {
    int vals [5];
    char *str = "14 22 33 48 5q";
    size_t converted;
    stringToIntList (str, vals, sizeof vals / sizeof vals[0], & converted);
    if (converted > 0) {
        size_t i;
        printf ("Converted %lu values from \"%s\":\n", (unsigned long) converted, str);
        for (i = 0; i < converted; i++)
            printf ("vals[%lu] = %d\n", (unsigned long) i, vals[i]);
    }
    else {
        printf ("Could not convert any of \"%s\" to equivalent integer values\n", str);
    }
    return 0;
}
