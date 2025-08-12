public void start (Stage primaryStage) {
    final HTMLEditor htmlEditor = new HTMLEditor ();
    primaryStage.setScene (new Scene (htmlEditor));
    primaryStage.show ();
    for (Node toolBar = htmlEditor.lookup (".tool-bar");
    toolBar != null; toolBar = htmlEditor.lookup (".tool-bar")) {
        ((Pane) toolBar.getParent ()).getChildren ().remove (toolBar);
    }
}




public void start(Stage primaryStage) {
        final HTMLEditor htmlEditor = new HTMLEditor();
        primaryStage.setScene(new Scene(htmlEditor, 700, 500));
        primaryStage.show();
        takeoffToolbar(htmlEditor);
        }

        private void takeoffToolbar(HTMLEditor htmlEditor) {
        for (Node toolBar = htmlEditor.lookup(".tool-bar"); toolBar != null; 
            toolBar = htmlEditor.lookup(".tool-bar")) {
            ((Pane) toolBar.getParent()).getChildren().remove(toolBar);
        }
}


