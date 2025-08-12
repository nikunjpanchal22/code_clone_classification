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
     HashSet<EventStatus> esValues = new HashSet<>();
     esValues.add(new EventStatus("Mach-1", 1477468500000L, 1, 0));
     esValues.add(new EventStatus("Mach-1", 1477472100000L, 2, 0));
     esValues.add(new EventStatus("Mach-1", 1477474200000L, 5, 0));
     esValues.add(new EventStatus("Mach-1", 1477476000000L, 3, 0));
     esValues.add(new EventStatus("Mach-1", 1477479600000L, 4, 0));
     esValues.add(new EventStatus("Mach-1", 1477486800000L, 1, 0));
     esValues.add(new EventStatus("Mach-2", 1477465200000L, 3, 1));
     esValues.add(new EventStatus("Mach-2", 1477472400000L, 2, 1));
     esValues.add(new EventStatus("Mach-2", 1477474200000L, 5, 1));   
     esValues.add(new EventStatus("Mach-2", 1477476000000L, 2, 1));
     esValues.add(new EventStatus("Mach-2", 1477479600000L, 3, 1));
     esValues.add(new EventStatus("Mach-2", 1477486800000L, 4, 1));

     ArrayList <String> list = new ArrayList <>(); 
     for (EventStatus es : esValues) {
        if (list.contains (es.getName ())) continue;
        else {
            list.add(es.getName()); 
            testData.add(es); 
        }
     } 
     catArray = new String [list.size ()]; 
     catArray = list.toArray (catArray);
}
