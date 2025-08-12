int main () {
    struct type t1, t2, t3;
    t1.type = CHAR;
    t1.value.c = 0x61;
    t2.type = LONG;
    t2.value.l = 0xFFFF;
    t3.type = CHARPTR;
    t3.value.s = "hello";
    test_fun (3, t1, t2, t3);
    test_fun2 (convert (t1), convert (t2), convert (t3));
    return 0;
}


int main () {
    struct type t1, t2, t3;
    t1.type = CHAR;
    t1.value.c = 0x61;
    t2.type = LONG;
    t2.value.l = 0xFFFF;
    t3.type = CHARPTR;
    t3.value.s = "hello";
    test_fun (t1, t2, t3);
    test_fun2 (t1.value.c, t2.value.l, t3.value.s);
    return 0;
}
