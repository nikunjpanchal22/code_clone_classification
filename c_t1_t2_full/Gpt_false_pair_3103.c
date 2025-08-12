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
    union int_chars d;
    d.a = 20;
    d.b[0] = 5;
    d.b[1] = 6;
    d.b[2] = 7;
    d.b[3] = 8;
    return 0;
}
