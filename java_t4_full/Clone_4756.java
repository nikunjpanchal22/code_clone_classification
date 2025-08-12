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
            if (evt.getPropertyName().equals(MVC_Model.PROGRESS)){
                updateProgress (evt);
            } else if (evt.getPropertyName().equals(MVC_Model.PROGRESS1)){
                updateProgressLabel(evt);
            } else if (evt.getPropertyName().equals(MVC_Model.PROGRESS2)){
                updateIconLabel(evt);
            }
        }

        private void updateProgress(PropertyChangeEvent evt) {
            view.setProgress((Integer) evt.getNewValue());
        }

        private void updateProgressLabel(PropertyChangeEvent evt) {
            view.setProgressLabel((String) evt.getNewValue());
        }

        private void updateIconLabel(PropertyChangeEvent evt) {
            view.setIconLabel((Icon) evt.getNewValue());
}


