int main (int argc, char **argv) {
    int n = 6;
    int tab [6] = {1, 2, 8, 4, 5, 6};
    int diff = abs (tab[1] - tab[0]), maxdiff = diff, i;
    for (i = 2; i < n; i++) {
        diff = abs (tab[i] - tab[i - 1]);
        if (diff > maxdiff)
            maxdiff = diff;
    }
    printf ("Max difference: %d\n", maxdiff);
    return 0;
}




int main (int argc, char **argv) {
    int length = 6;
    int arr[6] = {1, 2, 8, 4, 5, 6};
    int diff = abs(arr[1] - arr[0]);
    int maximum = diff;
    int i;
    for (i = 2; i < length; i++) {
        diff = abs(arr[i] - arr[i - 1]);
        maximum = (diff > maximum) ? diff : maximum;
    }
    printf ("Max difference: %d\n", maximum);
    return 0;
}


