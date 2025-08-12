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
    int j, a = 0, x = 4567, q, list [10];
    while (x) {
        q = x % 10;
        list[a++] = q;
        x /= 10;
    }
    for (j = a - 1; j >= 0; j--) {
        printf ("%d", list [j]);
    }
    return 0;
}
