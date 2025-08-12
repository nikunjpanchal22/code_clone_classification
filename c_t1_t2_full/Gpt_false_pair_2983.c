int main () {
    memset (myUnion.c, 0, 8 * sizeof (char));
    printMyUnion (& myUnion);
    memset (myUnion.c, 0, 8 * sizeof (char));
    myUnion.i = 10;
    printMyUnion (& myUnion);
    memset (myUnion.c, 0, 8 * sizeof (char));
    myUnion.f = 10;
    printMyUnion (& myUnion);
    memset (myUnion.c, 0, 8 * sizeof (char));
    myUnion.f = 3.1415;
    printMyUnion (& myUnion);
    return 0;
}


int main () {
    memset (myUnion.c, 0, 8 * sizeof (char));
    memset (myUnion.c, 0, 8 * sizeof (char));
    myUnion.i = 10;
    memset (myUnion.c, 0, 8 * sizeof (char));
    myUnion.f = 10;
    memset (myUnion.c, 0, 8 * sizeof (char));
    myUnion.f = 3.1415;
    printMyUnion (& myUnion);
    return 0;
}
