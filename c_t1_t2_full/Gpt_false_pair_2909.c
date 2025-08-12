int main () {
    int x;
    int sum = 0;
    for (x = 1; x <= 1000; x++)
        if (x % 3 == 0 || x % 5 == 0)
            sum += x;
    printf ("%d\n", sum);
    return 0;
}


int main () {
    int x;
    int sum = 0;
    for (x = 1; x <= 1000; x += 3)
        if (x % 3 == 0 || x % 5 == 0)
            sum += x;
    printf ("%d\n", sum);
    return 0;
}
