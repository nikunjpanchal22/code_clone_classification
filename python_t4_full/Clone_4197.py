def __init__(self, some_var) :
	QtCore.QObject.__init__(self, parent = None)
	self.some_var = some_var
	self.queue = mp.Queue()
	self.process = mp.Process(
	target = workermodule.some_complex_processing,
	args = (self.queue,))



def __init__(self, some_var):
        super().__init__(parent=None)
        self.some_var = some_var
        self.queue = multiprocessing.Queue()
        self.process = multiprocessing.Process(target=module_name.complex_processing_function, args=(self.queue,))



