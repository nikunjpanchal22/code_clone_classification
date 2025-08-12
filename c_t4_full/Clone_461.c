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
    for (int i = 0; i <= 1000000000; i++)
    {
        x = i;
        if (i < 4)
            y = i;
        else
            y = (i-1)*(i-3);
        test (x, y);
    }
}


