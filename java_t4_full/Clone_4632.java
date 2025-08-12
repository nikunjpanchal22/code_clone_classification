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
    size = Integer.valueOf(box.getSelectedItem().toString());
    if(e.getStateChange() == ItemEvent.SELECTED) {
        i = size;
        do{
            System.out.print(" " + (size - i + 1));
            i--;
         }while(i > 0);
         System.out.println();
    }
}


