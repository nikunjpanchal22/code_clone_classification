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
    int a;
    scanf ("%d", & a);
    int rows = 0, cols = a;
    for (rows = 0; rows < a; rows++, cols--) {
        if (rows == 0)
            print_full_row_line (cols);
        else
            print_beginning_and_ending_asterics (cols);
    }
    return 0;
}
