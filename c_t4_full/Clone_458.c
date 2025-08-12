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
    for (int i = 0; i < 4; i++)
    {
        x = i;
        y = i;
        test (x, y);
    }
    x = 4;
    y = 5;
    test (x, y);
    for (int i = 5; i < 1000000000;i += 2)
    {
        x = i;
        y = i+2;
        test (x, y);
    }
    x = 1000000000;
    y = 14846928141;
    test (x, y);
}


