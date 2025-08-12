int main () {
    bool is_prime [max];
    int i, int1, j, n;
    int1 = sqrt (max);
    for (n = 0; n < max; ++n) {
        is_prime[n] = true;
    }
    is_prime[0] = false;
    is_prime[1] = false;
    for (i = 2; i < int1; i++) {
        if (is_prime[i])
            for (j = i + i; j < max; j += i) {
                is_prime[j] = false;
            }
    }
    for (n = 2; n < max; ++n) {
        if (is_prime[n] == true)
            printf ("%d ", n);
    }
    return 0;
}


 int main () {
    int i, n, max;
    bool is_prime[max];
    int int1 = sqrt(max);
    //Initialize all elements to true
    for (i = 0; i < max; i++)
        is_prime[i] = true;
    //Since 0 and 1 are not prime, they are not prime
    is_prime[0] = false;
    is_prime[1] = false;
    //Iterate through the list and set all multiples of i to false
    for (i = 2; i < int1; i++) {
        if (is_prime[i] == true) {
            for (n = (i*i); n < max; n += i) {
                is_prime[n] = false;
            }
        }
    } 
    //Print out all prime numbers
    for (i = 2; i < max; ++i) {
        if (is_prime[i] == true)
            printf("%d ", i);
    }
    return 0;
}


