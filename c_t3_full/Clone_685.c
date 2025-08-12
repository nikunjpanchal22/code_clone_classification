int main () {
    int a [50] = {1, 2, -3, 0, 0, 6, 7, -8, 0, SENTINEL};
    int count = 0;
    int i = 0;
    for (i = 0; i < 50; i++) {
        if (a[i] == SENTINEL)
            break;
        if (a[i]) {
            count++;
        }
    }
    printf ("Total Element :%d ", count);
    return 0;
}


  int main () {
    int a [50] = {1, 2, -3, 0, 0, 6, 7, -8, 0, SENTINEL};
    int count = 0;
    int i;
    for (i = 0; i < 50 && a[i] != SENTINEL; i++) {
        if (a[i] != 0 )
            count++;
    }
    printf ("Total Element :%d ", count);
    return 0;
}


