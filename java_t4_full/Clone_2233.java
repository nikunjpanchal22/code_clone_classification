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
     List<EventStatus> esValues = new ArrayList<>();
     EventStatus es1 = new EventStatus("Mach-1", 1477468500000L, 1, 0);
     esValues.add(es1); 
     EventStatus es2 = new EventStatus("Mach-1", 1477472100000L, 2, 0);
     esValues.add(es2); 
     EventStatus es3 = new EventStatus("Mach-1", 1477474200000L, 5, 0);
     esValues.add(es3); 
     EventStatus es4 = new EventStatus("Mach-1", 1477476000000L, 3, 0); 
     esValues.add(es4); 
     EventStatus es5 = new EventStatus("Mach-1", 1477479600000L, 4, 0);
     esValues.add(es5); 
     EventStatus es6 = new EventStatus("Mach-1", 1477486800000L, 1, 0);
     esValues.add(es6); 
     EventStatus es7 = new EventStatus("Mach-2", 1477465200000L, 3, 1);
     esValues.add(es7); 
     EventStatus es8 = new EventStatus("Mach-2", 1477472400000L, 2, 1);
     esValues.add(es8); 
     EventStatus es9 = new EventStatus("Mach-2", 1477474200000L, 5, 1);
     esValues.add(es9); 
     EventStatus es10 = new EventStatus("Mach-2", 1477476000000L, 2, 1);
     esValues.add(es10); 
     EventStatus es11 = new EventStatus("Mach-2", 1477479600000L, 3, 1);
     esValues.add(es11);
     EventStatus es12 = new EventStatus("Mach-2", 1477486800000L, 4, 1);
     esValues.add(es12);
     
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


