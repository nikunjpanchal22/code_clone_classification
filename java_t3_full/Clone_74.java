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


 public void start(Stage stage) throws Exception{
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("Main.fxml"));
    loader.setBuilderFactory(new JavaFXBuilderFactory());
    Parent root = loader.load();
    Scene scene = new Scene(root);
    stage.setScene(scene);
    MainController controller = loader.getController();
    controller.setStage(stage);
    controller.showStage();
    stage.show();
}


