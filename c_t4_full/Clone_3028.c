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
#include <string.h>

int main(){
    char first[30], second[30];
    while(scanf("%s", first) != EOF){
        snprintf(second, sizeof first, "%s", first);
        puts(second); 
        break;
    }
    return 0;
}


