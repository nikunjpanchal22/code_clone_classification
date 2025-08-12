int main () {
    int n = 6;
    int tab [] = {1, 2, 8, 4, 5, 6};
    int maxdiff = 0;
    for (int i = 1; i < n; i++) {
        int diff = abs (tab[i] - tab[i - 1]);
        if (diff > maxdiff) {
            maxdiff = diff;
        }
    }
    printf ("%d\n", maxdiff);
    return 0;
}


 int main () {
    int n = 6;
    int tab [] = {1, 2, 8, 4, 5, 6};
    int maxdiff = 0;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 1; j < n; j++){
            int diff = abs(tab[j] - tab[i]);
            if (diff > maxdiff) {
                maxdiff = diff;
            }
        }
    }
    printf ("%d\n", maxdiff);
    return 0;
}
