public void propertyChange (PropertyChangeEvent pce) {
    if (MVC_Model.PROGRESS.equals (pce.getPropertyName ())) {
        view.setProgress ((Integer) pce.getNewValue ());
    }
    if (MVC_Model.PROGRESS1.equals (pce.getPropertyName ())) {
        view.setProgressLabel ((String) pce.getNewValue ());
    }
    if (MVC_Model.PROGRESS2.equals (pce.getPropertyName ())) {
        view.setIconLabel ((Icon) pce.getNewValue ());
    }
}





public void propertyChange (PropertyChangeEvent pce) {
    String propertyName = pce.getPropertyName();
    Object newValue = pce.getNewValue();

    if (MVC_Model.PROGRESS.equals (propertyName)) {
        view.setProgress ((Integer) newValue);
    } else if (MVC_Model.PROGRESS1.equals (propertyName)) {
        view.setProgressLabel ((String) newValue);
    } else if (MVC_Model.PROGRESS2.equals (propertyName)) {
        view.setIconLabel ((Icon) newValue);
    }
}


