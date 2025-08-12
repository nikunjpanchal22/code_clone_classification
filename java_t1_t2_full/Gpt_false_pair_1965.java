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
    String [] allQueryStrings = new String [] {"INSERT INTO `TABLENAME` VALUES('Monday', 5.6, 'June');", "INSERT INTO `TABLENAME` VALUES('Friday', 4.9, true),(6.2,'July', 8.1);",
    "INSERT INTO `TABLENAME` VALUES('February',11.4, false),('January', 'August', 6.3);", "INSERT INTO `TABLENAME` VALUES(9.9,7,'May'),(3.2, 'September', 19.5);" };
    for (String queryString : allQueryStrings) {
        System.out.println (queryString);
        for (String values : t.extractValues (queryString)) {
            System.out.println (values);
        }
    }
}
