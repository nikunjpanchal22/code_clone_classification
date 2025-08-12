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
    int items[5];
    char *entry = "14 22 33 48 5q";
    size_t succ;
    stringToIntList (entry, items, sizeof items / sizeof items [0], &succ);
    if (succ > 0) {
        size_t i;
        printf ("\nConverted %lu items from \"%s\":\n", (unsigned long) toConvert, entry);
        for (i = 0; i < toConvert; i++)
            printf ("items[%lu] = %d\n", (unsigned long) i, items[i]);
    }
    else {
        printf ("\nCould not convert any of \"%s\" to equivalent integer values\n", entry);
    }
    return 0;
}
