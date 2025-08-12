public void changed (ObservableValue < ? extends Bounds > observable, Bounds oldValue, Bounds newValue) {
    if (oldHeight != newValue.getHeight ()) {
        System.out.println ("newValue = " + newValue.getHeight ());
        oldHeight = newValue.getHeight ();
        textArea.setPrefHeight (textHolder.getLayoutBounds ().getHeight () + 20);
    }
}


 public void changed (ObservableValue < ? extends Bounds > observable, Bounds oldValue, Bounds newValue) {
    if (oldWidth != newValue.getWidth ()) {
        System.out.println ("newValue = " + newValue.getWidth ());
        oldWidth = newValue.getWidth ();
        textArea.setPrefWidth (textHolder.getLayoutBounds ().getWidth () + 20);
    }
}
