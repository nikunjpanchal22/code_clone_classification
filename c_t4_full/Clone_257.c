int main () {
    int i = 0, N, sum = 0;
    scanf ("%d", & N);
    int ar [N];
    for (i = 0; i < N; i++) {
        scanf ("%d", & ar [i]);
    }
    for (i = 0; i < N; i++) {
        sum = sum + ar[i];
    }
    printf ("%d\n", sum);
    return 0;
}



int main() {
    int i = 0, N, sum = 0, temp;
    scanf("%d", &N);
    int ar[N];
    while (i < N) {
        scanf("%d", &temp);
        ar[i] = temp;
        sum += temp;
        i++;
    }
    printf("%d\n", sum);
    return 0;
}


