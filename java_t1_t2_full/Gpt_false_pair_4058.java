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
    String [] allQueryStrings = new String [] {"INSERT INTO `TABLENAME` VALUES(a,b,c);", "INSERT INTO `TABLENAME` VALUES(x,y,z),(a,b,c);", "INSERT INTO `TABLENAME` VALUES(s,t,u),(a,'b(,)b',c);", "INSERT INTO `TABLENAME` VALUES(v,w,x),(a,'b),(b',c);"};
    for (String queryString : allQueryStrings) {
        System.out.println (queryString);
        for (String values : t.extractValues (queryString)) {
            System.out.println (values);
        }
    }
}
