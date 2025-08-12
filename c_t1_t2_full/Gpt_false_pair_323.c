int main () {
    unsigned ary [3] = {0};
    f (0, ary);
    printf ("f(0) = %d %d %d\n", ary [0], ary [1], ary [2]);
    f (1, ary);
    printf ("f(1) = %d %d %d\n", ary [0], ary [1], ary [2]);
    f (2, ary);
    printf ("f(2) = %d %d %d\n", ary [0], ary [1], ary [2]);
    return 0;
}


  int main () {
    double ary [3] = {0};
    f (0, ary);
    printf ("f(0) = %lf %lf %lf\n", ary [0], ary [1], ary [2]);
    f (1, ary);
    printf ("f(1) = %lf %lf %lf\n", ary [0], ary [1], ary [2]);
    f (2, ary);
    printf ("f(2) = %lf %lf %lf\n", ary [0], ary [1], ary [2]);
    return 0;
} 
