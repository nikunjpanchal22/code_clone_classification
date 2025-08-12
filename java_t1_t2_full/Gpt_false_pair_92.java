public void start (Stage stage) throws Exception {
    URL location = getClass ().getResource ("Main.fxml");
    FXMLLoader fxmlLoader = new FXMLLoader ();
    fxmlLoader.setLocation (location);
    fxmlLoader.setBuilderFactory (new JavaFXBuilderFactory ());
    Parent root = (Parent) fxmlLoader.load (location.openStream ());
    Scene scene = new Scene (root);
    stage.setScene (scene);
    MainController mainController = fxmlLoader.getController ();
    mainController.setStage (stage);
    mainController.showStage ();
}


 public void start(Stage stage) throws Exception {
    URL fxmlUrl = getClass().getResource("Main.fxml");
    FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(fxmlUrl);
    fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());
    Parent root = fxmlLoader.load(fxmlUrl.openStream());
    Scene scene = new Scene(root);
    stage.setScene(scene);
    MainController mainController = fxmlLoader.getController();
    mainController.setStage(stage);
    stage.show();
    mainController.showStage();
}
