void main () {
    for (int i = 0; i < N; i++) {
        dividends[i] = rand ();
        do
            divisors[i] = rand ();
        while (divisors[i] == 0);
    }
    LARGE_INTEGER t0, t1;
    QueryPerformanceCounter (& t0);
    for (int j = 0; j < M; j++)
        for (int i = 0; i < N; i++)
            results[i] = floordiv_signcheck (dividends[i], divisors[i]);
    QueryPerformanceCounter (& t1);
    printf ("signcheck    : %9llu\n", t1.QuadPart - t0.QuadPart);
    QueryPerformanceCounter (& t0);
    for (int j = 0; j < M; j++)
        for (int i = 0; i < N; i++)
            results[i] = floordiv_signcheck2 (dividends[i], divisors[i]);
    QueryPerformanceCounter (& t1);
    printf ("signcheck2   : %9llu\n", t1.QuadPart - t0.QuadPart);
    QueryPerformanceCounter (& t0);
    for (int j = 0; j < M; j++)
        for (int i = 0; i < N; i++)
            results[i] = floordiv_signmultiply (dividends[i], divisors[i]);
    QueryPerformanceCounter (& t1);
    printf ("signmultiply : %9llu\n", t1.QuadPart - t0.QuadPart);
    QueryPerformanceCounter (& t0);
    for (int j = 0; j < M; j++)
        for (int i = 0; i < N; i++)
            results[i] = floordiv_floatingpoint (dividends[i], divisors[i]);
    QueryPerformanceCounter (& t1);
    printf ("floatingpoint: %9llu\n", t1.QuadPart - t0.QuadPart);
}



void main () {
    for (int i = 0; i < N; i++) {
        dividends[i] = rand ();
        do
            divisors[i] = rand ();
        while (divisors[i] == 0);
    }
    LARGE_INTEGER t0, t1;
    QueryPerformanceCounter (& t0);
    for (int j = 0; j < M; j++)
        for (int i = 0; i < N; i++)
            results[i] = floordiv_signcheck (dividends[i], divisors[i]);
    QueryPerformanceCounter (& t1);
    printf ("signcheck    : %9llu\n", t1.QuadPart - t0.QuadPart);
    QueryPerformanceCounter (& t0);
    for (int j = 0; j < M; j++)
        for (int i = 0; i < N; i++)
            results[i] = floordiv_signcheck2 (dividends[i], divisors[i]);
    QueryPerformanceCounter (& t1);
    printf ("signcheck2   : %9llu\n", t1.QuadPart - t0.QuadPart);
    QueryPerformanceCounter (& t0);
    for (int j = 0; j < M; j++)
        for (int i = 0; i < N; i++)
            results[i] = floordiv_signmultiply (dividends[i], divisors[i]);
    QueryPerformanceCounter (& t1);
    printf ("signmultiply : %9llu\n", t1.QuadPart - t0.QuadPart);
    QueryPerformanceCounter (& t0);
    for (int j = 0; j < M; j++)
        for (int i = 0; i < N; i++)
            results[i] = floordiv_compare (dividends[i], divisors[i]);
    QueryPerformanceCounter (& t1);
    printf ("compare: %9llu\n", t1.QuadPart - t0.QuadPart);
}
