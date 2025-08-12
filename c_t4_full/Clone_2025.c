int main (void) {
    char line [256];
    int i;
    int x, y = 0;
    while (y < 5) {
        printf ("Please Insert X value\n");
        if (fgets (line, sizeof (line), stdin)) {
            if (validateLine (line)) {
                if (1 != sscanf (line, "%d", &x)) {
                    printf ("should never happen");
                    exit (1);
                }
                break;
            }
            else {
                printf ("Illegal input %s", line);
            }
        }
        y++;
    }
    if (y < 5)
        printf ("x=%d\n", x);
    else
        printf ("no more retries\n");
    return 0;
}


#8

#include <stdio.h>
#include <stdlib.h>

#define MAX_TRIES 5

int validateLine(char *line);

int main(void) {
    int y = 0, x = 0;
    char line[256];
  
    while(fgets(line, sizeof(line), stdin)){
        if(validateLine(line) && sscanf(line, "%d", &x)){
            printf("x = %d\n", x);
            return 0;
        }
        if(++y >= MAX_TRIES) break;
        printf("Illegal input %s", line);
    }
    printf("no more retries\n");
    return 0;
}


