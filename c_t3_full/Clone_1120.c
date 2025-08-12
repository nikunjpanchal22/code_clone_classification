int main () {
    int x;
    int sum = 0;
    for (x = 1; x <= 1000; x++)
        if (x % 3 == 0 || x % 5 == 0)
            sum += x;
    printf ("%d\n", sum);
    return 0;
}


 int main() {
    int x;
    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;
    for (x = 1; x <= 600; x+=3)  
        sum1 += x;
    for (x = 5; x <= 600; x+=5) 
        sum2 += x; 
    for (x = 601; x <= 1000; x++) 
        if (x % 3 == 0 || x % 5 == 0)
            sum3 += x; 
    printf ("%d\n", sum1 + sum2 + sum3);
    return 0;
}


