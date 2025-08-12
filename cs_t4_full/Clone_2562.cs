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


 
public void TestGetCurrentFloor6() 
{
    var elevator = new HydraulicElevator(Elevator.Environment.Offline);
    elevator.ElevatorArrivedOnFloor += TestElevatorArrived;
    elevator.Start().GoToFloor (5).Stop().WaitAndCheck(TIMEOUT, "Event did not arrive in time.");
    Assert.AreEqual(elevator.GetCurrentFloor(), 5);
}


