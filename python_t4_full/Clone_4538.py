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


    self.thread.active.connect(self.obj.beginning)
    self.obj.intReady.connect(self.refreshLabel)
    self.obj.moveToThread(self.thread)
    self.thread.initiate()
    self.setupInterface()




def __init__(self):
    super().__init__()
    self.label = QLabel("0")
    self.obj = worker.Job()


