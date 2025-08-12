public void start (Stage primaryStage) {
    double y1 = 15;
    ProgressBar p1 = new ProgressBar ();
    p1.setLayoutY (y1);
    HBox vb1 = new HBox (10);
    vb1.getChildren ().addAll (new Label ("Progressbar 1"), p1);
    double y2 = 15;
    ProgressBar p2 = new ProgressBar ();
    p2.setLayoutY (y2);
    HBox vb2 = new HBox (10);
    vb2.getChildren ().addAll (new Label ("Progressbar 2"), p2);
    double y3 = 15;
    ProgressBar p3 = new ProgressBar ();
    p3.setLayoutY (y3);
    HBox vb3 = new HBox (10);
    vb3.getChildren ().addAll (new Label ("Progressbar 3"), p3);
    TextChooser textChooser = new TextChooser (vb1, vb2, vb3);
    textChooser.setStyle ("-fx-font: 10px \"Verdana\";");
    StackPane root = new StackPane ();
    root.getChildren ().add (textChooser);
    Scene scene = new Scene (root, 300, 250);
    primaryStage.setTitle ("Hello World!");
    primaryStage.setScene (scene);
    primaryStage.show ();
}





public void start(Stage primaryStage) {
    ProgressBar p1 = new ProgressBar();
    ProgressBar p2 = new ProgressBar();
    ProgressBar p3 = new ProgressBar();
    VBox box = new VBox(new Label("Progressbar 1"), p1, 
                        new Label("Progressbar 2"), p2, 
                        new Label("Progressbar 3"), p3);
    primaryStage.setScene(new Scene(box, 300, 250));
    primaryStage.setTitle("Hello World!");
    primaryStage.show();
}


