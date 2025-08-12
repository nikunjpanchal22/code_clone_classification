public void itemStateChanged (ItemEvent e) {
    size = Integer.parseInt ((String) box.getSelectedItem ());
    if (e.getStateChange () == ItemEvent.SELECTED) {
        for (i = 1; i <= size; i ++) {
            System.out.print (" " + i);
        }
        System.out.println ();
    }
}


	public void itemStateChanged (ItemEvent e) {
    size = Integer.parseInt ((String) box.getSelectedItem ());
    int space_num = 0;
    if (e.getStateChange () == ItemEvent.SELECTED) {
       while (space_num < size) {
            System.out.print (" " + ++space_num);
            }
        System.out.println ();
    }
} 


