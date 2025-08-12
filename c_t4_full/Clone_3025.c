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

int main() {
    char one[] = "", two[] = "";
    while(scanf("%s", one) == 1){
        for(int i = 0; one[i]!='\0'; i++)
           two[i] = one[i]; 
        break;
    }
    printf("%s", two);
    return 0;
}


