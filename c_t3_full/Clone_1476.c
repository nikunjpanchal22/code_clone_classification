int main (int argc, char *argv []) {
    int a [N] = {0};
    while (next (a +N - 1, N) != 10) {
        for (int i = 0; i < N; i++) {
            if (a[i] != 0)
                printf ("%d", a[i]);
        }
        printf ("\n");
    }
    return 0;
}


  int main (int argc, char *argv []) {
    int a [N] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int i = 0; 
    while (i < N) {
        printf ("%d", a[i]);
        i++;
    }
    printf ("\n");
    return 0;
}


