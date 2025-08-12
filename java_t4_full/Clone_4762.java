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





public void propertyChange(PropertyChangeEvent pce) {
    Map<String, Runnable> actions = new HashMap<>();
    actions.put(MVC_Model.PROGRESS, () -> view.setProgress((Integer) pce.getNewValue()));
    actions.put(MVC_Model.PROGRESS1, () -> view.setProgressLabel((String) pce.getNewValue()));
    actions.put(MVC_Model.PROGRESS2, () -> view.setIconLabel((Icon) pce.getNewValue()));

    Runnable action = actions.get(pce.getPropertyName());
    if (action != null) action.run();
}


