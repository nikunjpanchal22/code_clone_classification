        public void changed (ObservableValue < ? extends Bounds > observable, Bounds oldValue, Bounds newValue) {
            if (oldHeight != newValue.getHeight ()) {
                System.out.println ("newValue = " + newValue.getHeight ());
                oldHeight = newValue.getHeight ();
                textArea.setPrefHeight (textHolder.getLayoutBounds ().getHeight () + 20);
            }
}


  public void changed (ObservableValue < ? extends Bounds > observable, Bounds oldValue, Bounds newValue) {if (oldHeight != newValue.getHeight()) {
      System.out.println("newValue = " + newValue.getHeight());
      oldHeight = newValue.getHeight();
      double difference = Math.abs(oldHeight - newValue.getHeight());
      double newHeight = textArea.getPrefHeight() + difference;
      textArea.setPrefHeight(Math.max(newHeight, textHolder.getLayoutBounds().getHeight() + 20));
   }
}


