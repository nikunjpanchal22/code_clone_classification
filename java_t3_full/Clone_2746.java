public void start (Stage stage) throws Exception {
    StackPane notedPane = new StackPane ();
    notedPane.setPrefSize (20, 20);
    notedPane.setMaxSize (Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);
    notedPane.setStyle ("-fx-background-color: purple;");
    StackPane rootPane = new StackPane (notedPane);
    rootPane.setPrefSize (400, 400);
    StackPane.setAlignment (notedPane, Pos.BOTTOM_CENTER);
    stage.setScene (new Scene (rootPane));
    stage.show ();
    Stage stickyNotesStage = new Stage ();
    stickyNotesStage.initOwner (stage);
    stickyNotesStage.initStyle (StageStyle.UNDECORATED);
    StackPane stickyNotesPane = new StackPane ();
    stickyNotesPane.setPrefSize (200, 200);
    stickyNotesPane.setStyle ("-fx-background-color: yellow;");
    stickyNotesStage.setScene (new Scene (stickyNotesPane));
    notedPane.hoverProperty ().addListener ((ChangeListener < Boolean >) (observable, oldValue, newValue) -> {
        if (newValue) {
            stickyNotesStage.show ();
        } else {
            stickyNotesStage.hide ();
        }
    });
}





public void start (Stage stage) throws Exception {
    Group notedPane = new Group();
    notedPane.setAutoSizeChildren(true);
    notedPane.setStyle ("-fx-background-color: purple;");
    Group rootPane = new Group(notedPane);
    rootPane.setAutoSizeChildren(true);
    stage.setScene (new Scene (rootPane, 400, 400));
    stage.show();
    Stage stickyNotesStage = new Stage ();
    stickyNotesStage.initOwner (stage);
    stickyNotesStage.initStyle (StageStyle.UNDECORATED);
    Group stickyNotesPane = new Group();
    stickyNotesStage.setScene (new Scene (stickyNotesPane, 200, 200));
    stickyNotesPane.setStyle ("-fx-background-color: yellow;");
    notedPane.hoverProperty().addListener((ChangeListener<Boolean>) (observable, oldValue, newValue) -> {
        if (newValue) {
            stickyNotesStage.show();
        } else {
            stickyNotesStage.hide();
        }
    });
}


