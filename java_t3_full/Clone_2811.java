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
        StringBuilder numbers = new StringBuilder();
        for(i = 1; i <= size; i++) {
            numbers.append(i).append(" ");
        }
        System.out.println(numbers.toString());
    }
}


