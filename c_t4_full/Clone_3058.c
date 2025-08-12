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

void print_full_row (int n) {
            for (int i = 0; i < n; i++) {
                printf("* ");
            }
            printf("\n");
        }

        void print_start_and_end_asterix (int n) {
            printf("* ");
            for (int i = 0; i < n-2; i++) {
                printf("  ");
            }
            printf("*\n");
        }

        int main () {
            int row, col;
            scanf ("%d", &row);
            col = row;
            while (row--) {
                (row==0) ? print_full_row (col) : print_start_and_end_asterix (col);
                col--;
            }
            return 0;
}


