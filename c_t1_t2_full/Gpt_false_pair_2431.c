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
    int data [50] = {1, 2, -3, 0, 0, 6, 7, -8, 0, SENTINEL};
    int sum = 0;
    int j = 0;
    for (j = 0; j < 50; j++) {
        if (data[j] == SENTINEL)
            break;
        if (data[j]) {
            sum++;
        }
    }
    printf ("Total Element :%d ", sum);
    return 0;
}
