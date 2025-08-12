int main (int argc, char const *argv []) {
    union int_chars c;
    c.a = 10;
    c.b[0] = 1;
    c.b[1] = 2;
    c.b[2] = 3;
    c.b[3] = 4;
    return 0;
}






int main (int argc, char const *argv []) {
    union {
        int a;
        unsigned char b[4];
    }c;
    c.a = 10;
    c.b[0] = 1;
    c.b[1] = 2;
    c.b[2] = 3;
    c.b[3] = 4;
    return 0;
}


