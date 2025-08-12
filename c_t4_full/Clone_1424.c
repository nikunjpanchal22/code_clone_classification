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
    int arr[1000];
    for (int j = 0; j < 1000; j++) {
        arr[j] = j+1;
    }
    for (int i = 0; i < 1000; i++) {
        if (arr[i] != 998) {
            printf ("%d\n", arr[i]);
        }
    }
    return 0;
}


