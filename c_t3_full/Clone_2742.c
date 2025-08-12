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
    int x = 0;
    int sum = 0;
    begin:
    if (++x > 1000)
        goto end;
    if (x % 3 == 0 || x % 5 == 0)
        sum += x;
    goto begin;
    end:
    printf ("%d\n", sum);
    return 0;
}


