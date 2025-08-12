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
    int largest_num = tab[0];
    int smallest_num = tab[0];

    for (int i = 0; i < n; i++) {
        if (tab[i] > largest_num) {
            largest_num = tab[i];
        }

       else if (tab[i] < smallest_num) {
            smallest_num = tab[i];
        }
    }
    maxdiff = abs(largest_num - smallest_num);
    printf ("%d\n", maxdiff);
    return 0;
}


