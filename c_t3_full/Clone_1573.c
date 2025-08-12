int main () {
    int n;
    scanf ("%d", & n);
    int row = 0, col = n;
    for (row = 0; row < n; row++, col--) {
        if (row == 0)
            print_full_row (col);
        else
            print_start_and_end_asterix (col);
    }
    return 0;
}


 int main () {
    int n;
    scanf ("%d", & n);
    int row = n - 1, col = 0;
    for (row; row >= 0; row--, col++) {
        if (row == n-1)
            print_full_row (col);
        else
            print_start_and_end_asterix (n - 1 - col);
    }
    return 0;
}


