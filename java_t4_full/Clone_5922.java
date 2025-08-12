public static void main (String [] args) {
    BinaryTreeWithoutRecursion < Integer > ls = new BinaryTreeWithoutRecursion < > ();
    ls.insert (1);
    ls.insert (2);
    ls.insert (3);
    ls.insert (4);
    ls.insert (5);
    ls.insert (6);
    ls.insert (7);
    ls.inOrderPrint ();
}




 

public static void main (String [] args) {
    BinaryTreeWithoutRecursion<Integer> ls = new BinaryTreeWithoutRecursion<>();
    for (int i = 1; i <= 7; i++) {
        ls.insert(i);
    }
    ls.inOrderPrint();
}


