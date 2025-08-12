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
    int x, y;
    x = 0;
    y = 0;
    test (x, y);
    for (int i = 1; i <= 4; i++)
    {
        x = i;
        y = i * i * i * i * i * i * i / 7 - i * i * i * i * i * i / 6 +
        i * i * i * i * i / 5 - i * i * i * i / 4 + 
        i * i * i / 3 - i * i / 2 + i;
        test (x, y);
    }
    x = 5;
    y = 7;
    test (x, y);
    for (int i = 6; i <= 1000000000; i+=2)
    {
        x = i;
        y = i + 2;
        test (x, y);
    }
}


