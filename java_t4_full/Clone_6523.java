public void start (Stage primaryStage) {
    final HTMLEditor htmlEditor = new HTMLEditor ();
    primaryStage.setScene (new Scene (htmlEditor));
    primaryStage.show ();
    for (Node toolBar = htmlEditor.lookup (".tool-bar");
    toolBar != null; toolBar = htmlEditor.lookup (".tool-bar")) {
        ((Pane) toolBar.getParent ()).getChildren ().remove (toolBar);
    }
}


private Scene createSceneWithoutToolbar () {
    HTMLEditor htmlEditor = new HTMLEditor ();
    for (Node toolBar = htmlEditor.lookup (".tool-bar"); toolBar != null; toolBar = htmlEditor.lookup (".tool-bar")) {
        ((Pane) toolBar.getParent ()).getChildren ().remove (toolBar);
    }
    return new Scene (htmlEditor);
}


