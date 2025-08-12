int main () {
    int x;
    int sum = 0;
    for (x = 1; x <= 1000; x++)
        if (x % 3 == 0 || x % 5 == 0)
            sum += x;
    printf ("%d\n", sum);
    return 0;
}




int sum_values(int x, int sum) {
    if(x > 1000)
        return sum;
    if (x % 3 == 0 || x % 5 == 0)
        sum += x;
    return sum_values(x+1, sum);
    }

int main () {
    int sum = sum_values(1, 0);
    printf ("%d\n", sum);
    return 0;
}


