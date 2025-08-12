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
    for (int i = 1000; i > 0; i=i-2) {
        if (i == 998) {
            i--;
            continue;
        }
        printf ("%d\n", i);
    }
    return 0;
}


