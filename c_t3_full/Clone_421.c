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
    int i = 1000;
    do {
        if (i == 998) {
            i--;
            continue;
        }
        printf ("%d\n", i);
        i--;
    } while (i > 0);

    return 0;
}


