int main () {
    int array [TABLES] [ROWS] [COLS] = {{{10, 20}, {30, 40}, {50, 60}, {70, 80}, {90, 100}}, {{18, 21}, {3, 4}, {5, 6}, {7, 81}, {9, 11}}};
    int (*table_ptr) [ROWS] [COLS] = array;
    size_t i = 0, j = 0, k = 0;
    for (i = 0; i < TABLES; ++i) {
        int (*row_ptr) [COLS] = *table_ptr++;
        for (j = 0; j < ROWS; ++j) {
            int *col_ptr = *row_ptr++;
            for (k = 0; k < COLS; ++k) {
                printf ("(%lu, %lu, %lu): %u\n", (unsigned long) i, (unsigned long) j, (unsigned long) k, * col_ptr ++);
            }
        }
    }
    return 0;
}


 

#include <stdio.h>
#define TABLES 3
#define ROWS 2
#define COLS 3

int main (){
    int array [TABLES] [ROWS] [COLS] = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}, {{13, 14, 15}, {16, 17, 18}}};
    int (*table_ptr) [ROWS] [COLS] = array;

    for(size_t i=0; i<TABLES; ++i)
    {
        for(size_t j=0; j<ROWS; ++j)
        {
            for(size_t k=0; k<COLS; k++)
            {
                printf("array[%lu][%lu][%lu] = %d \n", i, j, k, array[i][j][k]);
            }
        }
    }
    return 0;
}


