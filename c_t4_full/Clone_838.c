int main () {
    int i, c = 0, value = 4567, r, arr [10];
    while (value) {
        r = value % 10;
        arr[c++] = r;
        value /= 10;
    }
    for (i = c - 1; i >= 0; i--) {
        printf ("%d", arr [i]);
    }
    return 0;
}


 
int main () {
    int i, c = 0, value = 4567, r, arr [10];

    do {
        r = value % 10;
        arr[c] = r;
        value /= 10;
        c++;
    } while (value);
    for (int j = 0; j < c; j++) {
        printf ("%d", arr [c - j - 1]);
    }
    return 0;
}


