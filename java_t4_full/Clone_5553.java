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





public void start(final Stage primaryStage) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Something went wrong");
        alert.setContentText("Try again?");
        ButtonType retry = new ButtonType("Retry");
        ButtonType quit = new ButtonType("Quit", ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(retry, quit);
        Button b = new Button("Close Error");
        b.setOnAction(actionEvent -> handleCloseAlert(actionEvent, alert));
        primaryStage.setScene(new Scene(new Group(b), 500, 400));
        primaryStage.show();
        final Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == retry) { 
            System.out.println("Retry selected");
        } else {
            System.out.println("Quit selected");
        }
    }

    private void handleCloseAlert(ActionEvent event, Alert alert) {
        for (ButtonType bt : alert.getDialogPane().getButtonTypes()) {
            if (bt.getButtonData() == ButtonBar.ButtonData.CANCEL_CLOSE) {
                ((Button) alert.getDialogPane().lookupButton(bt)).fire();
                break;
            }
        }
}


