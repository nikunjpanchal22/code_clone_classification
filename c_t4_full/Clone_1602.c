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



 Enhanced Input Error Handling

#include <stdio.h>

int main ()
{
    int i = 0, j;
    int lines [18][3];
    
    while (i < 18 && scanf ("%i %i %i", &lines[i][0], &lines[i][1], &lines[i][2]) == 3) { i++; }
    for (j = 0; j < i && printf ("%i %i %i\n", lines[j][0], lines[j][1], lines[j][2]); j++);
    
    if (i == j) return 0;
    else return 1;
}


