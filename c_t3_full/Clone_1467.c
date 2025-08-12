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


  int main () 
{ 
    memset(myUnion.c, 0, 8 * sizeof(char)); 
    printMyUnion(&myUnion);
    
    myUnion.a[0] = 10;
    myUnion.a[2] = 10;
    printMyUnion(&myUnion); 
    
    memset(myUnion.c, 0, 8 * sizeof(char));
    myUnion.b[3] = 10;
    myUnion.b[5] = 10;
    printMyUnion(&myUnion); 
    
    memset(myUnion.c, 0, 8 * sizeof(char));
    myUnion.d[0] = 3.1415;
    myUnion.d[2] = 3.1415; 
    printMyUnion(&myUnion); 
    return 0;
}


