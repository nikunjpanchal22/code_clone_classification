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
    short ary [3] = {0};
    f (0, ary);
    printf ("f(0) = %hd %hd %hd\n", ary [0], ary [1], ary [2]);
    f (1, ary);
    printf ("f(1) = %hd %hd %hd\n", ary [0], ary [1], ary [2]);
    f (2, ary);
    printf ("f(2) = %hd %hd %hd\n", ary [0], ary [1], ary [2]);
    return 0;
} 
