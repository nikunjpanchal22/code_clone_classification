int main (int argc, char *argv []) {
    int i, j;
    int lines [18] [3];
    i = 0;
    while (i != sizeof (lines) / sizeof (lines[0]) && 3 == scanf ("%i %i %i", lines[i] + 0, lines[i] + 1, lines[i] + 2)) {
        i++;
    }
    for (j = 0; j != i; j++) {
        printf ("%i %i %i\n", lines [j] [0], lines [j] [1], lines [j] [2]);
    }
    return 0;
}



 Different Data Type

#include <stdio.h>

int main ()
{
    short i = 0, j;
    short lines [18][3];
    
    while (i < 18 && scanf ("%hi %hi %hi", &lines[i][0], &lines[i][1], &lines[i][2])) { i++; }
    for (j = 0; j < i; j++) { printf ("%hi %hi %hi\n", lines[j][0], lines[j][1], lines[j][2]); }
    
    return 0;
}


