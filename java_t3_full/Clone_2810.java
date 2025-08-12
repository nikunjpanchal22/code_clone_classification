public void itemStateChanged (ItemEvent e) {
    size = Integer.parseInt ((String) box.getSelectedItem ());
    if (e.getStateChange () == ItemEvent.SELECTED) {
        for (i = 1; i <= size; i ++) {
            System.out.print (" " + i);
        }
        System.out.println ();
    }
}



public void itemStateChanged(ItemEvent e) {
    size = Integer.parseInt((String) box.getSelectedItem());
    if(e.getStateChange() == ItemEvent.SELECTED) {
        i = 1;
        while(i <= size) {
            System.out.print(" " + i);
            i++;
        }
        System.out.println();
    }
}


