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


 
int main () {
    int i = 0, N, sum = 0;
    scanf ("%d", & N);
    int ar [N];
    int temp;
    for (i = 0; i < N; i++) {
        scanf ("%d", & temp);
        ar[i] = temp;
        sum += temp;
    }
    printf ("%d\n", sum);
    return 0;
}


