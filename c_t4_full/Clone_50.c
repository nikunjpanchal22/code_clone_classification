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


 void main() {
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
            results[i] = floordiv_bitwise (dividends[i], divisors[i]);
    QueryPerformanceCounter (& t1);
    printf ("bitwise     : %9llu\n", t1.QuadPart - t0.QuadPart);
    QueryPerformanceCounter (& t0);
    for (int j = 0; j < M; j++)
        for (int i = 0; i < N; i++)
            results[i] = floordiv_shift (dividends[i], divisors[i]);
    QueryPerformanceCounter (& t1);
    printf ("shift       : %9llu\n", t1.QuadPart - t0.QuadPart);
    QueryPerformanceCounter (& t0);
    for (int j = 0; j < M; j++)
        for (int i = 0; i < N; i++)
            results[i] = floordiv_mult (dividends[i], divisors[i]);
    QueryPerformanceCounter (& t1);
    printf ("multiply    : %9llu\n", t1.QuadPart - t0.QuadPart);
    QueryPerformanceCounter (& t0);
    for (int j = 0; j < M; j++)
        for (int i = 0; i < N; i++)
            results[i] = floordiv_modulo (dividends[i], divisors[i]);
    QueryPerformanceCounter (& t1);
    printf ("modulo      : %9llu\n", t1.QuadPart - t0.QuadPart);
    QueryPerformanceCounter (& t0);
    for (int j = 0; j < M; j++)
        for (int i = 0; i < N; i++)
            results[i] = floordiv_reciprocal (dividends[i], divisors[i]);
    QueryPerformanceCounter (& t1);
    printf ("reciprocal  : %9llu\n", t1.QuadPart - t0.QuadPart);
    QueryPerformanceCounter (& t0);
    for (int j = 0; j < M; j++)
        for (int i = 0; i < N; i++)
            results[i] = floordiv_bisection (dividends[i], divisors[i]);
    QueryPerformanceCounter (& t1);
    printf ("bisection   : %9llu\n", t1.QuadPart - t0.QuadPart);
    QueryPerformanceCounter (& t0);
    for (int j = 0; j < M; j++)
        for (int i = 0; i < N; i++)
            results[i] = floordiv_division (dividends[i], divisors[i]);
    QueryPerformanceCounter (& t1);
    printf ("division    : %9llu\n", t1.QuadPart - t0.QuadPart);
    QueryPerformanceCounter (& t0);
    for (int j = 0; j < M; j++)
        for (int i = 0; i < N; i++)
            results[i] = floordiv_truncation (dividends[i], divisors[i]);
    QueryPerformanceCounter (& t1);
    printf ("truncation  : %9llu\n", t1.QuadPart - t0.QuadPart);
    QueryPerformanceCounter (& t0);
    for (int j = 0; j < M; j++)
        for (int i = 0; i < N; i++)
            results[i] = floordiv_rounding (dividends[i], divisors[i]);
    QueryPerformanceCounter (& t1);
    printf ("rounding    : %9llu\n", t1.QuadPart - t0.QuadPart);
    QueryPerformanceCounter (& t0);
    for (int j = 0; j < M; j++)
        for (int i = 0; i < N; i++)
            results[i] = floordiv_ceiling (dividends[i], divisors[i]);
    QueryPerformanceCounter (& t1);
    printf ("ceiling     : %9llu\n", t1.QuadPart - t0.QuadPart);
}


