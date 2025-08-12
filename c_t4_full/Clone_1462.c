int main (int argc, char *argv []) {
    char game [10] = argv[0];
    int players = atoi (argv[1]);
    char deck [52] [3];
    for (int i = 0; i < argc - 2; i++) {
        strcpy (deck [i], argv [i + 2]);
    }
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define SIZE 10

int main(int argc, char *argv[]) {
    char game[SIZE];
    strcpy(game, argv[0]);
    int players = (argc > 1) ? atoi(argv[1]) : 0; 

    char deck[52][3];
    memset(deck, 0, sizeof deck);
    for(int i = 0; i < argc-2; i++) {
        strncpy(deck[i], argv[i+2], 2);
    }
    return 0;
}


