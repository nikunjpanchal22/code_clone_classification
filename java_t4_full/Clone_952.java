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
    String num_string = "";
    if (e.getStateChange () == ItemEvent.SELECTED) {
        for (int i = 1; i <= size; i ++) {
            num_string = i + num_string;
            if (i == size) 
                num_string = " " + num_string;
        }
        System.out.println (num_string);
    }
}


