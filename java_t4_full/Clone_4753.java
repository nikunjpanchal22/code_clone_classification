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
    if (propertyName != null) {
        switch (propertyName) {
            case MVC_Model.PROGRESS:
                view.setProgress ((Integer) pce.getNewValue ());
                break;
            case MVC_Model.PROGRESS1:
                view.setProgressLabel ((String) pce.getNewValue ());
                break;
            case MVC_Model.PROGRESS2:
                view.setIconLabel ((Icon) pce.getNewValue ());
                break;
        }
    }
}


