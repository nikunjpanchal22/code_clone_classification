int main () {
    char str [5] [100];
    for (int i = 0; i < 5; i++) {
        fgets (str [i], 100, stdin);
    }
    for (int j = 0; j < 5; j++) {
        printf ("%s\n", str [j]);
    }
    return 0;
}



#include <stdio.h>
int main() {
    char lines[5][100];
    for (int x=0; x<5; x++) {
        fgets(lines[x], sizeof(lines[x]), stdin);
    }
    for (int x=0; x<5; x++) {
        fputs(lines[x], stdout);
    }
    return 0;
}


