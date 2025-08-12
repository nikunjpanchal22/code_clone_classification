int main () {
    for (int i = 1; i <= 1000; i++) {
        if (i == 998) {
            continue;
        }
        printf ("%d\n", i);
    }
    return 0;
}




#define TOTAL 1000

int main() {
    int i;
    for (i = 1; i <= TOTAL; i++) {
        if (i != 998) {
            printf("%d\n", i);
        }
    }
    return 0;
}


