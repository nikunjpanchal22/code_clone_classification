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
    String [] allQueryStrings = new String [] {"INSERT INTO `TABLENAME` VALUES('Bobby', 5.6, 'Fischer');", "INSERT INTO `TABLENAME` VALUES('Steve', 4.9, true),('Yuki','Komatsu', 8.1);",
    "INSERT INTO `TABLENAME` VALUES('Nakamura', 11.4, false),('Anand','Gelfand', 6.3);", "INSERT INTO `TABLENAME` VALUES('Giri', 7, 'Carlsen'),(3.2, 'Andreikin',19.5);" };
    for (String queryString : allQueryStrings) {
        System.out.println (queryString);
        for (String values : t.extractValues (queryString)) {
            System.out.println (values);
        }
    } 
}
