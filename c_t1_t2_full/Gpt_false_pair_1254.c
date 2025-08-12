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


 int main() {
    int a;
    while (true) {
        printf ("Give me an int\n");
        if (scanf ("%d", &a)) {
            break;
        }
        if (scanf ("%[^\n]") == EOF) {
            break;
        }
    } 
}
