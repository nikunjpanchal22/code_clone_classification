int main () {
    int num, x, tmp, sum = 0;
    scanf ("%d", & num);
    tmp = num;
    printf ("Factors are: ");
    while (1) {
        x = getFirst (tmp);
        printf ("%d ", x);
        if (x == tmp)
            break;
        tmp /= x;
    }
    printf ("\n");
    printf ("Sum of factors is: ");
    tmp = num;
    while (1) {
        x = getFirst (tmp);
        printf ("%d ", x);
        sum += x;
        if (x == tmp)
            break;
        printf ("+ ");
        tmp /= x;
    }
    printf ("= %d\n", sum);
}


int main () {
    int num, x, tmp, average = 0;
    scanf ("%d", & num);
    tmp = num;
    printf ("Factors are: ");
    while (1) {
        x = getFirst (tmp);
        printf ("%d ", x);
        if (x == tmp)
            break;
        tmp /= x;
    }
    printf ("\n");
    printf ("Average of factors is: ");
    tmp = num;
    int count = 0;
    while (1) {
        x = getFirst (tmp);
        printf ("%d ", x);
        average += x;
        count++;
        if (x == tmp)
            break;
        printf ("+ ");
        tmp /= x;
    }
    printf ("= %d/%d", average, count);
    printf ("= %f \n", average/(float)count);
}
