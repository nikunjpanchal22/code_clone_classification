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


#10

#include <stdio.h>
#include <stdlib.h>

#define MAX_ATTEMPTS 5

int validateLine(char *line);

int main(void) {
    char line[256];
    int x, attempts = 0;
  
    while(attempts < MAX_ATTEMPTS) {
        printf("Please Insert X value\n");
        if (fgets(line, sizeof(line), stdin) && validateLine(line) && sscanf(line, "%d", &x) == 1) {
            printf("x = %d\n", x);
            return 0;
        }

        printf("Illegal input %s", line);
        attempts++;
    }
    printf("no more retries\n");
  
    return 0;
}


