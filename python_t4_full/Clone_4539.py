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


    self.obj.completed.connect(self.thread.stopThread)
    self.thread.startThread.connect(self.obj.executeJob)
    self.obj.intReady.connect(self.updateInterface)
    self.obj.moveToThread(self.thread)
    self.thread.beginThread()
    self.initInterface()




def __init__(self):
    super().__init__()
    self.label = QLabel("0")


