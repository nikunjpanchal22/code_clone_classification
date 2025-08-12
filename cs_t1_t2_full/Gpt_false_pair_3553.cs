static void Main (string [] args) {
    var fsm = new FiniteStateMachine ();
    Console.WriteLine (fsm.State);
    fsm.ProcessEvent (FiniteStateMachine.Events.PlugIn);
    Console.WriteLine (fsm.State);
    fsm.ProcessEvent (FiniteStateMachine.Events.TurnOn);
    Console.WriteLine (fsm.State);
    fsm.ProcessEvent (FiniteStateMachine.Events.TurnOff);
    Console.WriteLine (fsm.State);
    fsm.ProcessEvent (FiniteStateMachine.Events.TurnOn);
    Console.WriteLine (fsm.State);
    fsm.ProcessEvent (FiniteStateMachine.Events.RemovePower);
    Console.WriteLine (fsm.State);
    Console.ReadKey ();
}


static void Main (string [] args) {
    FiniteStateMachine fsm = new FiniteStateMachine ();
    Console.WriteLine (fsm.State);
    fsm.ChangeState(FiniteStateMachine.Events.PlugIn);
    Console.WriteLine (fsm.State);
    fsm.ChangeState(FiniteStateMachine.Events.TurnOn);
    Console.WriteLine (fsm.State);
    fsm.ChangeState(FiniteStateMachine.Events.TurnOff);
    Console.WriteLine (fsm.State);
    fsm.ChangeState(FiniteStateMachine.Events.TurnOn);
    Console.WriteLine (fsm.State);
    fsm.ChangeState(FiniteStateMachine.Events.RemovePower);
    Console.WriteLine (fsm.State);
    Console.ReadKey ();
}
