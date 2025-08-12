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
    int cutamounttotal = 0;
    int totalamount = 0;
    cutamounttotal = CUTAMOUNT (tree1, limit);
    totalamount += cutamounttotal;
    cutamounttotal = CUTAMOUNT (tree2, limit);
    totalamount += cutamounttotal;
    cutamounttotal = CUTAMOUNT (tree3, limit);
    totalamount += cutamounttotal;
    printf ("Amount to remove: %d\n", totalamount);
    return 0;
}


