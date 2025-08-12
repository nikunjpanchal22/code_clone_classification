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





public void propertyChange(PropertyChangeEvent evt) {
    Function<String, Boolean> isPropertyMatch = propName -> propName.equals(evt.getPropertyName());
    if (isPropertyMatch.apply(MVC_Model.PROGRESS)) {
        view.setProgress ((Integer) evt.getNewValue ());
    } else if (isPropertyMatch.apply(MVC_Model.PROGRESS1)) {
        view.setProgressLabel ((String) evt.getNewValue ());
    } else if (isPropertyMatch.apply(MVC_Model.PROGRESS2)) {
        view.setIconLabel ((Icon) evt.getNewValue ());
    }
}


