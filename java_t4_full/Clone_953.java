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
    if (e.getStateChange () == ItemEvent.SELECTED) {
        String[] num_strings = new String[size];
        for (int i = 0; i < size; i++) {
            num_strings[i] = Integer.toString(i + 1);
        }
        String num_string = String.join(" ", num_strings);
        System.out.println(num_string);
    }  
}


