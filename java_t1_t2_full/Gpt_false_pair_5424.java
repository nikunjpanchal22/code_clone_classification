public void changed (ObservableValue < ? extends Worker.State > observableValue, Worker.State state, Worker.State newState) {
    if (newState.equals (Worker.State.SUCCEEDED)) {
        dialog.show ();
        dialog.toFront ();
    }
}



public void changed (ObservableValue < ? extends Employee.Status > observableValue, Employee.Status status, Employee.Status newStatus) {
    if (newStatus.equals (Employee.Status.COMPLETED)) {
        dialog.show ();
        dialog.toFront ();
    }
}
