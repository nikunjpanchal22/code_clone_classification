int main () {
    int a;
    do {
        printf ("Give an intiger\n");
        if (scanf ("%d", &a)) {
            break;
        }
        if (scanf ("%*[^\n]") == EOF) {
            break;
        }
    }
    while (1);
}


int main () {
    
    int a;
    do {
        printf ("Give an intiger\n");
        if (scanf ("%d", &a) == 1) {
            break;
        }
        else if (scanf ("%*[^\n]") == EOF) {
            break;
        }
    } while (1);
}
