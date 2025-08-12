public static void main (String [] args) {
    Test t = new Test ();
    String [] allQueryStrings = new String [] {"INSERT INTO `TABLENAME` VALUES(xxx,yyy,zzz);", "INSERT INTO `TABLENAME` VALUES(xxx,yyy,zzz),(aaa,bbb,ccc);", "INSERT INTO `TABLENAME` VALUES(xxx,yyy,zzz),(aaa,'bb(,)b',ccc);", "INSERT INTO `TABLENAME` VALUES(xxx,yyy,zzz),(aaa,'bb),(b',ccc);"};
    for (String queryString : allQueryStrings) {
        System.out.println (queryString);
        for (String values : t.extractValues (queryString)) {
            System.out.println (values);
        }
    }
}


  public static void main (String [] args) {
    Test t = new Test ();
    String [] allQueryStrings = new String [] {"INSERT INTO `TABLENAME` VALUES(11, 12, 18.1);", "INSERT INTO `TABLENAME` VALUES(14, 15, 17.4),(19,9,20);",
    "INSERT INTO `TABLENAME` VALUES('red', 'blue', 12),('yellow','green','10');", "INSERT INTO `TABLENAME` VALUES(true, 8, 3.2),('white','black', 9.9);" };
    for (String queryString : allQueryStrings) {
        System.out.println (queryString);
        for (String values : t.extractValues (queryString)) {
            System.out.println (values);
        }
    }
}
