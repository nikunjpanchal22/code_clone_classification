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





#include <iostream>

#define print_full_row(N) { for (int i = 0; i < N; i++) printf("*"); printf("\n"); }
#define print_start_and_end_asterix(N) { printf("*"); for (int i = 0; i < N-2; i++) printf(" "); printf("*\n"); }

int main () {
    int line, line_;
    scanf ("%d", &line);
    for (line_ = line; line_ > 0; line_--, line -= 1)
        (!line_ == --line) ? print_full_row(line_) : print_start_and_end_asterix(line_);
    return 0;
}


