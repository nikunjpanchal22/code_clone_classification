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
    int x;
    scanf ("%d", & x);
    int row = 0, col = x;
    for (row = 0; row < x; row++, col--) {
        if (row == 0)
            print_bottom_half (col);
        else
            print_first_and_last (col);
    }
    return 0;
}
