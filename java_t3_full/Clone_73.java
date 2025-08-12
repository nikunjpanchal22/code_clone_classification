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
    URL location = getClass().getResource("Main.fxml");
    FXMLLoader loader = new FXMLLoader(location);
    loader.setBuilderFactory(new JavaFXBuilderFactory());
    Parent root = loader.load();
    Scene scene = new Scene(root);
    stage.setScene(scene);
    MainController mainController = loader.getController();
    mainController.setStage(stage);
    mainController.showStage();
    stage.show();
}


