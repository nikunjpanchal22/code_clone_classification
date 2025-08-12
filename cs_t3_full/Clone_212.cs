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
    Console.WriteLine (fsm.PresentState());
    fsm.HandleEvent (FiniteStateMachine.Events.PlugIn);
    Console.WriteLine (string.Format("State changed to {0}",fsm.PresentState()));
    fsm.HandleEvent (FiniteStateMachine.Events.TurnOn);
    Console.WriteLine (string.Format("State changed to {0}",fsm.PresentState()));
    fsm.HandleEvent (FiniteStateMachine.Events.TurnOff);
    Console.WriteLine (string.Format("State changed to {0}",fsm.PresentState()));
    fsm.HandleEvent (FiniteStateMachine.Events.TurnOn);
    Console.WriteLine (string.Format("State changed to {0}",fsm.PresentState()));
    fsm.HandleEvent (FiniteStateMachine.Events.RemovePower);
    Console.WriteLine (string.Format("State changed to {0}",fsm.PresentState()));
    Console.ReadKey ();
}


