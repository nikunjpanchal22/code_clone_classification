int main () {
    char *str [10];
    char *i [10];
    int each = 0;
    int loop = 0;
    int n = 0;
    while ((n = scanf ("%m[^:]:%m[^:]:", &str[each], &i[each])) == 2) {
        printf ("# inputs read: %d\n", n);
        printf ("%s\n", str [each]);
        printf ("%s\n", i [each]);
        each++;
        if (each > 9) {
            break;
        }
    }
    for (loop = 0; loop < each; loop++) {
        printf ("str[%d]=%s\n", loop, str [loop]);
    }
    for (loop = 0; loop < each; loop++) {
        printf ("i[%d]=%s\n", loop, i [loop]);
    }
    for (loop = 0; loop < each; loop++) {
        free (str [loop]);
        free (i [loop]);
    }
    return 0;
}



#define SIZE 10
#define FORMAT "%m[^:]:%m[^:]"

int main () {
    char *str [SIZE], *i [SIZE];
    int each = 0, n = 0;

    while ((n = scanf (FORMAT, &str[each], &i[each])) == 2 && each++ < SIZE) {
        printf ("# inputs read: %d\n%s\n%s\n", n, str[each - 1], i[each - 1]);
    }
    
    while (each--) {
        printf ("str[%d]=%s\n", each, str[each]);
        printf ("i[%d]=%s\n", each, i[each]);
        free (str [each]);
        free (i [each]);
    }
    return 0;
}


