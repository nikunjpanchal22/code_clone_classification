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
    size = Integer.valueOf((String) box.getSelectedItem());
    if(e.getStateChange() == ItemEvent.SELECTED) {
        IntStream.range(1, size + 1).mapToObj(i -> i + " ").forEach(System.out::print);
        System.out.println();
    }
}


