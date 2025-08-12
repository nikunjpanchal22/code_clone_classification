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
    int num [5];
    char *string = "14 22 33 48 5q";
    size_t conversion;
    stringToIntList (string, num, sizeof num / sizeof num [0], &conversion);
    if (conversion > 0) {
        size_t i;
        printf ("\nConverted %lu items from \"%s\":\n", (unsigned long) conversion, string);
        for (i = 0; i < conversion; i++)
            printf ("num[%lu] = %d\n", (unsigned long) i, num[i]);
    }
    else {
        printf ("\nCould not convert any of \"%s\" to equivalent integer values\n", string);
    }
    return 0;
}
