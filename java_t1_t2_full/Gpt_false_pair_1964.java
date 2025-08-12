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
    String [] allQueryStrings = new String [] {"INSERT INTO `TABLENAME` VALUES('$', 5.6, 'z');", "INSERT INTO `TABLENAME` VALUES('#', 4.9, 9.7),(true,'x', 8.1);",
    "INSERT INTO `TABLENAME` VALUES(11.4,'v',4),(false, 'q', 6.3);", "INSERT INTO `TABLENAME` VALUES('A', 7, false),('&', 19.5, '@');" };
    for (String queryString : allQueryStrings) {
        System.out.println (queryString);
        for (String values : t.extractValues (queryString)) {
            System.out.println (values);
        }
    }
}
