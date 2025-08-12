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
    test (1, 1);
    test (2, 2);
    test (3, 4);
    int x, y;
    for (int i = 4; i <= 1000000000; i += 3)
    {
        if (i % 2 == 0)
        {
            x = i;
            y = i + 4;
        }
        else
        {
            x = i;
            y = i + 5;
        }
        test (x, y);
    }
}


