int main () {
    for (int i = 0; i < 6; i++) {
        for (int k = i; k < 5; k++) {
            printf ("+");
        }
        for (int j = 0; j < i; j++) {
            printf ("*");
        }
        printf ("\n");
    }
    return 0;
}


	int main () {
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 5-i; j++) {
            printf (" ");
        }
        for (int k = i; k < 5; k++) {
            printf ("+");
        }
        printf ("\n");
    }
    return 0;
}
