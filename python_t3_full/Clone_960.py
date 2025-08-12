def __init__(self, some_var) :
	QtCore.QObject.__init__(self, parent = None)
	self.some_var = some_var
	self.queue = mp.Queue()
	self.process = mp.Process(
	target = workermodule.some_complex_processing,
	args = (self.queue,))


  def __init__(self, some_var):
    QtCore.QObject.__init__(self, parent = None)
    self.some_var = some_var
    #Create a manager and shared queue
    manager = mp.Manager()
    self.queue = manager.Queue(maxsize=1024)
    #Create a process for the target function
    self.process = mp.Process(
        target=workermodule.some_complex_processing,
        args=(self.queue,),
        daemon=True)


