private void initData () {
    testData = new ArrayList < EventStatus > ();
    testData.add (new EventStatus ("Mach-1", 1477468500000L, 1, 0));
    testData.add (new EventStatus ("Mach-1", 1477472100000L, 2, 0));
    testData.add (new EventStatus ("Mach-1", 1477474200000L, 5, 0));
    testData.add (new EventStatus ("Mach-1", 1477476000000L, 3, 0));
    testData.add (new EventStatus ("Mach-1", 1477479600000L, 4, 0));
    testData.add (new EventStatus ("Mach-1", 1477486800000L, 1, 0));
    testData.add (new EventStatus ("Mach-2", 1477465200000L, 3, 1));
    testData.add (new EventStatus ("Mach-2", 1477472400000L, 2, 1));
    testData.add (new EventStatus ("Mach-2", 1477474200000L, 5, 1));
    testData.add (new EventStatus ("Mach-2", 1477476000000L, 2, 1));
    testData.add (new EventStatus ("Mach-2", 1477479600000L, 3, 1));
    testData.add (new EventStatus ("Mach-2", 1477486800000L, 4, 1));
    ArrayList < String > list = new ArrayList < > ();
    for (EventStatus eventStatus : testData) {
        if (list.contains (eventStatus.getName ())) continue;
        else list.add (eventStatus.getName ());
    }
    catArray = new String [list.size ()];
    catArray = list.toArray (catArray);
}


  private void initData(){ 
     testData = new ArrayList<EventStatus>(); 
     ArrayList <String> list = new ArrayList <>(); 
     EventStatus[] esValues = {new EventStatus("Mach-1", 1477468500000L, 1, 0), 
                              new EventStatus("Mach-1", 1477472100000L, 2, 0),
                              new EventStatus("Mach-1", 1477474200000L, 5, 0),
                              new EventStatus("Mach-1", 1477476000000L, 3, 0),
                              new EventStatus("Mach-1", 1477479600000L, 4, 0),
                              new EventStatus("Mach-1", 1477486800000L, 1, 0),
                              new EventStatus("Mach-2", 1477465200000L, 3, 1),
                              new EventStatus("Mach-2", 1477472400000L, 2, 1),
                              new EventStatus("Mach-2", 1477474200000L, 5, 1),
                              new EventStatus("Mach-2", 1477476000000L, 2, 1),
                              new EventStatus("Mach-2", 1477479600000L, 3, 1),
                              new EventStatus("Mach-2", 1477486800000L, 4, 1)};
   
     for (EventStatus es : esValues) {
        if (list.contains (es.getName ())) continue;
        else 
            list.add(es.getName()); 
            testData.add(es); 
       } 
       
     catArray = new String [list.size ()]; 
     catArray = list.toArray (catArray);
}


