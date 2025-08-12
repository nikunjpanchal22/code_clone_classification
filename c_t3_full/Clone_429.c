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
    for (int i = 1; i < 998; i=i+2) {
        printf ("%d\n", i);
    }
    for (int i = 999; i <= 1000; i=i+2) {
        printf ("%d\n", i);
    }
    return 0;
}


