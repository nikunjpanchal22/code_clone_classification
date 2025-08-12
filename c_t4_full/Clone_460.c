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
    for (int i = 0; i <= 1000; i++)
    {
        if (i % 2 == 0)
        {
            x = i;
            y = i*i/2;
        }
        else
        {
            x = i;
            y = (i+1)*(i-1)/2;
        }
        test (x, y);
    }
    for (int i = 1001; i <= 1000000000; i+=2)
    {
        x = i;
        y = i+2;
        test (x, y);
    }
}


