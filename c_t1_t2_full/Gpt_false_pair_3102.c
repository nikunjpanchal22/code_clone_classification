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
    union int_chars e;
    e.a = 30;
    e.b[0] = 9;
    e.b[1] = 10;
    e.b[2] = 11;
    e.b[3] = 12;
    return 0;
}
