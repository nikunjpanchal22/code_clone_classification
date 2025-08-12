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

int main () {
    char line [256], cmd [32], dir [32];
    int x, y;
    
    if (!(fgets(line, sizeof(line), stdin)) || sscanf(line, "%31s%d%d%31s", cmd, &x, &y, dir) != 4 || strcmp(cmd, "init") || x < 0 || x > 99 || y < 0 || y > 99 || strcmp(dir, "NORTH"))
        return 1;

    printf ("Your command: %s %d %d %s\n", cmd, x, y, dir);
    return 0;
}


