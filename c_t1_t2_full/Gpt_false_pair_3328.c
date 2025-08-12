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
        int arr [5] = {4, 5, 6, 7, 8};
        int (*pa) [5] = &arr;
        int *pi = arr;
        for (int j = 0; j < 5; j++) {
            printf ("\n%d %d", arr [j], (* pa) [j]);
        }
        printf ("\n0x%x -- 0x%x", pi, pa);
        pi++;
        pa++;
        printf ("\n0x%x -- 0x%x", pi, pa);
    }

    
// Type 4 code clone variant
int main () {
    int arr [5] = {4, 5, 6, 7, 8};
    int (*pa) [5] = &arr;
    int *pi = arr;
    for (int k = 0; k < 5; k++) {
        printf ("\n%d %d", arr [k], (* pa) [k]);
    }
    printf ("\n0x%x -- 0x%x", pi, pa);
    pi++;
    pa++;
    printf ("\n0x%x -- 0x%x", pi, pa);
}
