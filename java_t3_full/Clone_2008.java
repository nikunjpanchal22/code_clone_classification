public void start (Stage primaryStage) {
    final HTMLEditor htmlEditor = new HTMLEditor ();
    primaryStage.setScene (new Scene (htmlEditor));
    primaryStage.show ();
    for (Node toolBar = htmlEditor.lookup (".tool-bar");
    toolBar != null; toolBar = htmlEditor.lookup (".tool-bar")) {
        ((Pane) toolBar.getParent ()).getChildren ().remove (toolBar);
    }
}



 public void start (Stage primaryStage) { final HTMLEditor htmlEditor = new HTMLEditor();
    Pane htmlEditorPane = new Pane();
    htmlEditorPane.getChildren().add(htmlEditor);
    primaryStage.setScene(new Scene(htmlEditorPane));
    primaryStage.show();
    Node toolBar = htmlEditor.lookup(".tool-bar");
    if (toolBar != null) {
        ((Pane) toolBar.getParent()).getChildren().remove(toolBar);
    }
}


