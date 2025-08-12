def __init__(self, some_var) :
	QtCore.QObject.__init__(self, parent = None)
	self.some_var = some_var
	self.queue = mp.Queue()
	self.process = mp.Process(
	target = workermodule.some_complex_processing,
	args = (self.queue,))


def __init__(self, some_var):
    super(MyClass, self).__init__()
    self.some_var = some_var
    self.queue = multiprocessing.Queue()
    self.process = mp.Process(target=some_module.process, args=(self.queue,))




