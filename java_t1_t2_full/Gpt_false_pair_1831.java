public void start (Stage stage) {
    stage.setTitle ("TRON Synopsis");
    Font.loadFont (CustomFontApp.class.getResource ("TRON.TTF").toExternalForm (), 10);
    Label title = new Label ("TRON");
    title.getStyleClass ().add ("title");
    Label caption = new Label ("A sci-fi flick set in an alternate reality.");
    caption.getStyleClass ().add ("caption");
    caption.setMaxWidth (220);
    caption.setWrapText (true);
    caption.setTextAlignment (TextAlignment.CENTER);
    VBox layout = new VBox (10);
    layout.setStyle ("-fx-padding: 20px; -fx-background-color: silver");
    layout.setAlignment (Pos.CENTER);
    layout.getChildren ().setAll (title, new ImageView (new Image ("http://ia.media-imdb.com/images/M/MV5BMTY5NjM2MjAwOV5BMl5BanBnXkFtZTYwMTgyMzA5.V1.SY317.jpg")), caption);
    final Scene scene = new Scene (layout);
    scene.getStylesheets ().add (getClass ().getResource ("custom-font-styles.css").toExternalForm ());
    stage.setScene (scene);
    stage.show ();
}


public void start (Stage stage) {
    stage.setTitle ("TRON-Unforgettable!");
    Font.loadFont (CustomFontApp.class.getResource ("TRON.TTF").toExternalForm (), 10);
    Label title = new Label ("TRON");
    title.getStyleClass ().add ("title");
    Label caption = new Label ("A classic story of man adventuring in a universe of his own design.");
    caption.getStyleClass ().add ("caption");
    caption.setMaxWidth (220);
    caption.setWrapText (true);
    caption.setTextAlignment (TextAlignment.CENTER);
    VBox layout = new VBox (10);
    layout.setStyle ("-fx-padding: 10px; -fx-background-color: black");
    layout.setAlignment (Pos.CENTER);
    layout.getChildren ().setAll (title, new ImageView (new Image ("http://ia.media-imdb.com/images/M/MV5BMTY5NjM2MjAwOV5BMl5BanBnXkFtZTYwMTgyMzA5.V1.SY317.jpg")), caption);
    final Scene scene = new Scene (layout);
    scene.getStylesheets ().add (getClass ().getResource ("custom-font-styles.css").toExternalForm ());
    stage.setScene (scene);
    stage.show ();
}
