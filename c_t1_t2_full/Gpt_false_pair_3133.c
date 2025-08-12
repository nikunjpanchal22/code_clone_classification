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
    int k, b = 0, y = 4567, s, set [10];
    while (y) {
        s = y % 10;
        set[b++] = s;
        y /= 10;
    }
    for (k = b - 1; k >= 0; k--) {
        cout << set[k];
    }
    return 0;
}
