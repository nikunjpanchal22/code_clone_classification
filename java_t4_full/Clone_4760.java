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





public void propertyChange (PropertyChangeEvent evt) {
    if (evt.getPropertyName().equals(MVC_Model.PROGRESS)) {
        view.setProgress((int) evt.getNewValue());
    }
    if (evt.getPropertyName().equals(MVC_Model.PROGRESS1)) {
        view.setProgressLabel(evt.getNewValue().toString());
    }
    if (evt.getPropertyName().equals(MVC_Model.PROGRESS2)) {
        view.setIconLabel((ImageIcon) evt.getNewValue());
    }
}


