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





#include <stdio.h>

#define print_full_row(N) { for (int i = 0; i < N; i++) printf("#"); printf("\n"); }
#define print_start_and_end_asterix(N) { printf("#"); for (int i = 0; i < N-2; i++) printf(" "); printf("#\n"); }

int main () {
    int n, n_;
    scanf ("%d", &n);
    for (n_ = n; n_ > 0; n_--, n -= 1)
        (n_ == n) ? print_full_row(n_) : print_start_and_end_asterix(n_);
    return 0;
}


