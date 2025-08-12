public void start (Stage primaryStage) {
    final HTMLEditor htmlEditor = new HTMLEditor ();
    primaryStage.setScene (new Scene (htmlEditor));
    primaryStage.show ();
    for (Node toolBar = htmlEditor.lookup (".tool-bar");
    toolBar != null; toolBar = htmlEditor.lookup (".tool-bar")) {
        ((Pane) toolBar.getParent ()).getChildren ().remove (toolBar);
    }
}


 public void start (Stage primaryStage) {final HTMLEditor htmlEditor = new HTMLEditor();
    Scene scene = new Scene(htmlEditor);
    primaryStage.setScene(scene);
    primaryStage.show();
    List<Node> toolBars = htmlEditor.lookupAll(".tool-bar");
    scene.getRoot().getChildren().removeAll(toolBars);
}


