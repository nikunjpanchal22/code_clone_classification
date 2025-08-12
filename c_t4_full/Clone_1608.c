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



 Loop Merges

#include <stdio.h>

int main ()
{
    int j = 0, i;
    int lines [18][3];
    
    while ((i = scanf ("%i %i %i", &lines[j][0], &lines[j][1], &lines[j][2])) == 3 || i == EOF) {
        if (i == 3) printf ("%i %i %i\n", lines[j][0], lines[j][1], lines[j][2]);

        j++;
    } 
    
    return 0;
}


