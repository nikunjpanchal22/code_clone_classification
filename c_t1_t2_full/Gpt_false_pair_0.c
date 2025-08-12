int main (int argc, char **argv) {
    int tree1 = 14;
    int tree2 = 7;
    int tree3 = 16;
    int limit = 11;
    int cutamounttotal = 0;
    cutamounttotal += CUTAMOUNT (tree1, limit);
    cutamounttotal += CUTAMOUNT (tree2, limit);
    cutamounttotal += CUTAMOUNT (tree3, limit);
    printf ("Amount to remove: %d\n", cutamounttotal);
    return 0;
}


 int main (int argc, char **argv) {
    int tree1 = 14;
    int tree2 = 7;
    int tree3 = 16;
    int limit = 11;
    int cutamounttotal1 = 0;
    int cutamounttotal2 = 0;
    int cutamounttotal3 = 0;
    cutamounttotal1 += CUTAMOUNT (tree1, limit);
    cutamounttotal2 += CUTAMOUNT (tree2, limit);
    cutamounttotal3 += CUTAMOUNT (tree3, limit);
    printf ("Amount to remove: %d\n", cutamounttotal1 + cutamounttotal2 + cutamounttotal3);
    return 0;
}
