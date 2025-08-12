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
    if ("progress".equalsIgnoreCase (pce.getPropertyName())) {
        view.updateProgress ((int) pce.getNewValue ());
    }
    if ("progressLabel".equalsIgnoreCase (pce.getPropertyName())) {
        view.updateProgressLabel ((String) pce.getNewValue ());
    }
    if ("iconLabel".equalsIgnoreCase (pce.getPropertyName())) {
        view.updateIconLabel ((ImageIcon) pce.getNewValue ());
    }
}


