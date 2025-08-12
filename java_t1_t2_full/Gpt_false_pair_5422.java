public void changed (ObservableValue < ? extends Worker.State > observableValue, Worker.State state, Worker.State newState) {
    if (newState.equals (Worker.State.SUCCEEDED)) {
        dialog.show ();
        dialog.toFront ();
    }
}


public void modified (ObservableValue < ? extends Worker.Status > observableValue, Worker.Status status, Worker.Status newStatus) {
    if (newStatus.equals (Worker.Status.ACHIEVED)) {
        dialog.demonstrate ();
        dialog.moveToFront ();
    }
}
