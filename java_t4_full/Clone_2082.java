public static void main (String [] args) {
    Address address = new Address ();
    address.setSomeCrap (null);
    Person person = new Person ();
    person.setAddress (address);
    long startTime = System.currentTimeMillis ();
    for (int i = 0;
    i < 1000000; i ++) {
        try {
            System.out.println (person.getAddress ().getSomeCrap ().getCrap ());
        } catch (NullPointerException npe) {
        }
    }
    long endTime = System.currentTimeMillis ();
    System.out.println ((endTime - startTime) / 1000F);
    long startTime1 = System.currentTimeMillis ();
    for (int i = 0;
    i < 1000000; i ++) {
        if (person != null) {
            Address address1 = person.getAddress ();
            if (address1 != null) {
                SomeCrap someCrap2 = address1.getSomeCrap ();
                if (someCrap2 != null) {
                    System.out.println (someCrap2.getCrap ());
                }
            }
        }
    }
    long endTime1 = System.currentTimeMillis ();
    System.out.println ((endTime1 - startTime1) / 1000F);
}


  public static void main(String[] args) {       
    Address address = new Address();
    person.setAddress(address);
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < 1000000; i++) {
        if (person != null && address != null) {
            SomeCrap someCrap = address.getSomeCrap();
            if (someCrap != null && someCrap.getCrap() != null) {
                System.out.println(someCrap.getCrap()); 
            } 
        }
    }
    long endTime = System.currentTimeMillis();
    System.out.println((endTime - startTime) / 1000F);    
}


