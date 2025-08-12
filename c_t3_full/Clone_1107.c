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
    int count = 0;
    for (int i = 0; i < 6; i++) {
        while (count < 5-i) {
            printf (" ");
            count++;
        }
        count = 0;
        while (count < i) {
            printf ("+");
            count++;
        }
        printf ("\n");
    }
    return 0;
}


