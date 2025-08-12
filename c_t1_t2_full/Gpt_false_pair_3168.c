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


int main () {
    char *str [10];
    char *i [10];
    int each = 0;
    int loop = 0;
    int n = 0;
    while ((n = scanf ("%m[^:]:%m[^:]%*c", &str[each], &i[each])) == 2) {
        printf ("# inputs read: %d\n", n);
        printf ("%s\n", str [each]);
        printf ("%s\n", i [each]);
        each++;
        if (each > 9) {
            break;
        }
    }
    for (loop = 0; loop <= each; loop++) 
    { 
        printf("str[%d] = %s\n", loop, str[loop]); 
        printf("i[%d] = %s\n", loop, i[loop]); 
        free(str[loop]); 
        free(i[loop]); 
    } 
    return 0;
}
