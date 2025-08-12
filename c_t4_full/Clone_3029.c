int main (void) {
    char one [30];
    char two [30];
    while (fgets (one, sizeof (one), stdin)) {
        int len = strlen (one);
        for (int i = 0; i < (len + 1); i++) {
            two[i] = one[i];
        }
        printf ("%s", two);
        break;
    }
    return EXIT_SUCCESS;
}





#include <stdio.h>

int main(){
    char one[30] = {}, two[30] = {};
    fread(one, 1, 30, stdin);
    memcpy(two, one, sizeof(one));
    printf("%s", two);
    return 0;
}


