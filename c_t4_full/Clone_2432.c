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
    int arr[1000], i, sum = 0;
    for(i = 1; i <= 1000; i++)
        arr[i-1] = i;
    for(i = 1; i <= 1000; i++)
        if(arr[i-1] % 3 == 0 || arr[i-1] % 5 == 0)
            sum += arr[i-1];
    printf ("%d\n", sum);
    return 0;
}


