[TestMethod] public void TestGetCurrentFloor () {
    var elevator = new Elevator (Elevator.Environment.Offline);
    elevator.ElevatorArrivedOnFloor += TestElevatorArrived;
    lock (this)
    {
        elevator.GoToFloor (5);
        if (! Monitor.Wait (this, TIMEOUT))
            Assert.Fail ("Event did not arrive in time.");
    } int floor = elevator.GetCurrentFloor ();
    Assert.AreEqual (floor, 5);
}



public void TestGetCurrentFloor2() 
{
    var elevator = new Elevator (Elevator.Environment.Offline);
    elevator.ElevatorArrivedOnFloor += TestElevatorArrived;
    Run(elevator.GoToFloor, 5, elevator.GetCurrentFloor, Assert.AreEqual, TIMEOUT);
}


