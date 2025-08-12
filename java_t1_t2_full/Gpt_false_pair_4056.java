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


public static void Main (String [] args) {
    Test t = new Test ();
    String [] allQueryStrings = new String [] {"INSERT INTO `TABLENAME` VALUES(xxx,yyy,zzz);",
                                              "INSERT INTO `TABLENAME` VALUES(xxx,yyy,zzz),(aaa,bbb,ccc);", 
                                              "INSERT INTO `TABLENAME` VALUES(xxx,yyy,zzz),(aaa,'bb(,)b',ccc);", 
                                              "INSERT INTO `TABLENAME` VALUES(xxx,yyy,zzz),(aaa,'bb),(b',ccc);"};
    for (String queryString : allQueryStrings) {
        System.out.println (queryString);
        for (String values : t.extractValues (queryString)) {
            System.out.println (values);
        }
    }
}
