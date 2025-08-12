public void start (final Stage primaryStage) {
    Alert alert = new Alert (Alert.AlertType.CONFIRMATION);
    alert.setTitle ("Title");
    alert.setHeaderText ("Some Text");
    alert.setContentText ("Choose your option.");
    ButtonType buttonTypeOne = new ButtonType ("Yes");
    alert.initModality (Modality.NONE);
    ButtonType buttonTypeCancel = new ButtonType ("No", ButtonBar.ButtonData.CANCEL_CLOSE);
    alert.getButtonTypes ().setAll (buttonTypeOne, buttonTypeCancel);
    Button b = new Button ("close alert");
    b.setOnAction ((ActionEvent event) -> {
        for (ButtonType bt : alert.getDialogPane ().getButtonTypes ()) {
            System.out.println ("bt = " + bt);
            if (bt.getButtonData () == ButtonBar.ButtonData.CANCEL_CLOSE) {
                Button cancelButton = (Button) alert.getDialogPane ().lookupButton (bt);
                cancelButton.fire ();
                break;
            }
        }
    });
    final Scene scene = new Scene (new Group (b), 400, 300);
    primaryStage.setScene (scene);
    primaryStage.show ();
    Optional < ButtonType > result = alert.showAndWait ();
    if (result.get () == buttonTypeOne) {
        System.out.println ("one ");
    } else if (result.get () == buttonTypeCancel) {
        System.out.println ("cancel ");
    }
}


public void start (final Stage primaryStage) {
    Alert alert = new Alert (Alert.AlertType.CONFIRMATION);
    alert.setTitle ("Title");
    alert.setHeaderText ("Some Text");
    alert.setContentText ("Choose your option.");
    ButtonType buttonTypeOne = new ButtonType ("Yes");
    alert.initModality (Modality.NONE);
    ButtonType buttonTypeCancel = new ButtonType ("No", ButtonBar.ButtonData.CANCEL_CLOSE);
    alert.getButtonTypes ().setAll (buttonTypeOne, buttonTypeCancel);
    Button b = new Button ("hide this alert");
    b.setOnAction ((ActionEvent event) -> {
        for (ButtonType bt : alert.getDialogPane ().getButtonTypes ()) {
            System.out.println ("bt = " + bt);
            if (bt.getButtonData () == ButtonBar.ButtonData.CANCEL_CLOSE) {
                Button cancelButton = (Button) alert.getDialogPane ().lookupButton (bt);
                cancelButton.fire ();
                break;
            }
        }
    });
    final Scene scene = new Scene (new Group (b), 400, 300);
    primaryStage.setScene (scene);
    primaryStage.show ();
    Optional < ButtonType > result = alert.showAndWait ();
    if (result.get () == buttonTypeOne) {
        System.out.println ("you clicked yes button ");
    } else if (result.get () == buttonTypeCancel) {
        System.out.println ("you clicked no button ");
    }
}
