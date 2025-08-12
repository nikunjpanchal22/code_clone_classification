public void itemStateChanged (ItemEvent e) {
    size = Integer.parseInt ((String) box.getSelectedItem ());
    if (e.getStateChange () == ItemEvent.SELECTED) {
        for (i = 1; i <= size; i ++) {
            System.out.print (" " + i);
        }
        System.out.println ();
    }
}



public void itemStateChanged(ItemEvent e){
    size = Integer.parseInt((String)box.getSelectedItem());
    if(e.getStateChange() == ItemEvent.SELECTED){
        IntStream.rangeClosed(1, size).forEach(i -> System.out.print(" " + i));
        System.out.println();
    }
}


