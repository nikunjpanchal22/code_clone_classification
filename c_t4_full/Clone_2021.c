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


#5

#include <stdio.h>
#include <stdlib.h>

int validateLine(char *line);

int main() {
    char line[256];
    int x, y = 0;
    
    while (y < 5) {
        printf("Please Insert X value\n");
        if (!(fgets(line, sizeof(line), stdin) && validateLine(line) && sscanf(line, "%d", &x) == 1)) {
            printf("Illegal input %s", line);
            y++;
            continue;
        }
        printf("x=%d\n", x);
        return 0;
    }
    printf("no more retries\n");
    return 0;
}


