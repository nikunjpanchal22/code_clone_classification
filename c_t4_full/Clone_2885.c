int main (void) {
    char line [256];
    char cmd [32];
    char dir [32];
    int x;
    int y;
    if (fgets (line, sizeof line, stdin) == NULL) {
        return 1;
    }
    if (sscanf (line, "%32s%d%d%32s", cmd, &x, &y, dir) != 4) {
        return 1;
    }
    if (strcmp (cmd, "init") != 0) {
        return 1;
    }
    if (x < 0 || x > 99 || y < 0 || y > 99) {
        return 1;
    }
    if (strcmp (dir, "NORTH") != 0) {
        return 1;
    }
    printf ("Your command: %s %d %d %s\n", cmd, x, y, dir);
    return 0;
}





#include <stdio.h>
#include <string.h>

#define CMD "init"
#define DIR "NORTH"
#define RANGE_MIN 0
#define RANGE_MAX 99

int main() {
    char line [256] = {0};
    char cmd [32] = {0};
    char dir [32] = {0};
    int x = 0;
    int y = 0;

    if(fgets(line, sizeof(line), stdin)) sscanf(line, "%31s%d%d%31s", cmd, &x, &y, dir);

    if(!strcmp(cmd, CMD) && x >= RANGE_MIN && x <= RANGE_MAX && y >= RANGE_MIN && y <= RANGE_MAX && !strcmp(dir, DIR)) {
        printf("Your command: %s %d %d %s\n", cmd, x, y, dir);
        return 0;
    }

    return 1;
}


