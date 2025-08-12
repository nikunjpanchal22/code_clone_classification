void main () {
    int w, nwords [MAX] = {0}, i = 0;
    while ((w = getchar ()) != EOF) {
        if (w == ' ' || w == '\t' || w == '\n')
            ++i;
        else
            ++nwords[i];
    }
    for (i = 0; i < MAX; i++) {
        printf ("\n");
        for (; nwords[i] > 0; nwords[i]--)
            printf ("$");
        if (nwords[i + 1] == 0)
            break;
        printf ("\n");
    }
    printf ("\n");
}


void main () {
    int w, nwords [MAX] = {0}, i = 0;
    while ((w = getchar ()) != EOF) {
        if (w == ' ' || w == '\t' || w == '\n')
            ++i;
        else
            ++nwords[i];
    }
    for (i = 0; i < MAX; i++) {
        printf ("\n");
        for (; nwords[i] > 0; nwords[i]--)
            printf ("*");
        if (nwords[i + 1] == 0)
            break;
        printf ("\n");
    }
    printf ("\n");
}
