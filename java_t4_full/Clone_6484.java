public void start (Stage primaryStage) {
    final HTMLEditor htmlEditor = new HTMLEditor ();
    primaryStage.setScene (new Scene (htmlEditor));
    primaryStage.show ();
    for (Node toolBar = htmlEditor.lookup (".tool-bar");
    toolBar != null; toolBar = htmlEditor.lookup (".tool-bar")) {
        ((Pane) toolBar.getParent ()).getChildren ().remove (toolBar);
    }
}




public void start (Stage primaryStage) {
        final HTMLEditor htmlEditor = new HTMLEditor ();
        primaryStage.setScene(new Scene(htmlEditor, 800, 600));
        primaryStage.show ();
        removeToolbars(htmlEditor);
        }

        private void removeToolbars(HTMLEditor htmlEditor) {
        for (Node toolBar = htmlEditor.lookup (".tool-bar");
        toolBar != null; toolBar = htmlEditor.lookup (".tool-bar")) {
            ((Pane) toolBar.getParent()).getChildren().remove(toolBar);
        }
}


