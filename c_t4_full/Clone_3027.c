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
    char s1[30], s2[30];
    while(scanf("%s", s1) != EOF){
        strcpy(s2, s1);
        puts(s2); 
        break;
    }
    return 0;
}


