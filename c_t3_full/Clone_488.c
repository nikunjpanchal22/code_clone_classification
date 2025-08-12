int main (int argc, char *argv []) {
    char game [10] = argv[0];
    int players = atoi (argv[1]);
    char deck [52] [3];
    for (int i = 0; i < argc - 2; i++) {
        strcpy (deck [i], argv [i + 2]);
    }
    return 0;
}


 int main (int argc, char *argv []) {
    char game [10] = argv[0];
    int players = atoi (argv[1]);
    char deck [52] [3];
    char* current_card;
    for (int i = 0; i < argc - 2; i++) {
        current_card = argv[i+2];
        strcpy (deck[i], current_card);
    }
    return 0;
}


