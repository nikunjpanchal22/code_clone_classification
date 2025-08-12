int main () {
    for (int i = 1; i <= 1000; i++) {
        if (i == 998) {
            continue;
        }
        printf ("%d\n", i);
    }
    return 0;
}



int main () {
    for (unsigned short int i = 1; i <= 1000; i++) {
        if (i == 998U) {
            continue;
        }
        printf ("%hu\n", i);
    }
    return 0;
}
