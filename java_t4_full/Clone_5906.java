        public void changed (ObservableValue < ? extends Bounds > observable, Bounds oldValue, Bounds newValue) {
            if (oldHeight != newValue.getHeight ()) {
                System.out.println ("newValue = " + newValue.getHeight ());
                oldHeight = newValue.getHeight ();
                textArea.setPrefHeight (textHolder.getLayoutBounds ().getHeight () + 20);
            }
}






public void changed(ObservableValue<? extends Bounds> observable, Bounds oldValue, Bounds newValue) {
    double newHeight = newValue.getHeight();
    if (oldHeight != newHeight) {
        System.out.printf("New height = %.2f\n", newHeight);
        oldHeight = newHeight;
        textArea.setPrefHeight(newHeight + 20);
    }
}


