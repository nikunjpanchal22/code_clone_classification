int main () {
    test (0, 0);
    test (1, 1);
    test (2, 2);
    test (3, 4);
    test (4, 5);
    test (5, 7);
    test (6, 9);
    test (1000000000, 14846928141);
}



int main () {
    test (0, 0);
    for (int i = 1; i <= 5; i++)
    {
        test (i, i*i - i);
    }
    long long int n = 1000000000;
    test (n, 14846928141);
}


