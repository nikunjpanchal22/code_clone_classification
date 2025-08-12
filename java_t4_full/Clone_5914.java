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





public static void main(String[] args) {
    BinaryTreeWithoutRecursion<Integer> ls = new BinaryTreeWithoutRecursion<>();
    IntStream.rangeClosed(1, 7).forEach(ls::insert);
    ls.inOrderPrint();
}


