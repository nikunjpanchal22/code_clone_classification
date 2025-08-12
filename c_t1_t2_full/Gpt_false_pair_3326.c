int main () {
    int arr [5] = {4, 5, 6, 7, 8};
    int (*pa) [5] = &arr;
    int *pi = arr;
    for (int i = 0; i < 5; i++) {
        printf ("\n%d %d", arr [i], (* pa) [i]);
    }
    printf ("\n0x%x -- 0x%x", pi, pa);
    pi++;
    pa++;
    printf ("\n0x%x -- 0x%x", pi, pa);
}


int main () {
    int arr [4] = {2, 3, 4, 5};
    int (*pa) [4] = &arr;
    int *pi = arr;
    for (int i = 0; i < 4; i++) {
        printf ("\n%d %d", arr [i], (* pa) [i]);
    }
    printf ("\n0x%x -- 0x%x", pi, pa);
    pi++;
    pa++;
    printf ("\n0x%x -- 0x%x", pi, pa);
}
