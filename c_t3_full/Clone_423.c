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
    int i;
    for (i = 1; i <= 1000;) {
        if (i == 998) {
            i += 2;
            continue;
        }
        printf ("%d\n", i);
        i++;
    }
    return 0;
}


