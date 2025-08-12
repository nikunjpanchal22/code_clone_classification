public void changed (ObservableValue < ? extends Bounds > observable, Bounds oldValue, Bounds newValue) {
    if (oldHeight != newValue.getHeight ()) {
        System.out.println ("newValue = " + newValue.getHeight ());
        oldHeight = newValue.getHeight ();
        textArea.setPrefHeight (textHolder.getLayoutBounds ().getHeight () + 20);
    }
}



public void changed (ObservableValue < ? extends Bounds > observable, Bounds oldValue, Bounds newValue) {
    if (oldLength != newValue.getLength ()) {
        System.out.println ("newValue = " + newValue.getLength ());
        oldLength = newValue.getLength ();
        textArea.setPrefHeight (textHolder.getLayoutBounds ().getLength () + 20);
    }
}
