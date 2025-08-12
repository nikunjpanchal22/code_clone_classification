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


  [TestMethod] public void AnalyzeGetCurrentFloor()
{
     var elevator = new Elevator(Elevator.Environment.Offline);
     elevator.ElevatorArrivedOnFloor += TestElevatorArrived;
     lock (this)
     {
        elevator.GoToFloor(5);
        if (!Monitor.Wait(this, TIMEOUT))
            Assert.Fail("Event did not occur timely.");
     } 
     int floor = elevator.GetCurrentFloor();
     Assert.AreEqual(floor, 5);
}
