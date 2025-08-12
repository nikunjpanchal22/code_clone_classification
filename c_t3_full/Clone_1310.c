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
    int max = tab[0];
    int min = tab[0];
    for (int i = 0; i < n; i++) {
        if (tab[i] > max) {
            max = tab[i];
        }

        else if (tab[i] < min) {
            min = tab[i];
        }
    }
    
    maxdiff = abs(max - min);
    printf ("%d\n", maxdiff);
    return 0;
}


