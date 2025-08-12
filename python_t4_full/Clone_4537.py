def __init__(self) :
	super().__init__()
	self.label = QLabel("0")
	self.obj = worker.Worker()
	self.thread = QThread()
	self.obj.intReady.connect(self.onIntReady)
	self.obj.moveToThread(self.thread)
	self.obj.finished.connect(self.thread.quit)
	self.thread.started.connect(self.obj.procCounter)
	self.thread.start()
	self.initUI()


    self.obj.intReady.connect(self.processOutput)
    self.obj.moveToThread(self.thread)
    self.thread.go()
    self.instantiateUI()




def __init__(self):
    super().__init__()
    self.label = QLabel('0')
    self.obj = worker.Function()
    self.thread = QThread()


