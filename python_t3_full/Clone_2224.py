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


    self.drawUI()




def __init__(self):
    super().__init__()
    self.label = QLabel("0")
    self.obj = worker.Work()
    self.thread = QThread()
    self.obj.isDone.connect(self.thread.terminate)
    self.thread.isStarted.connect(self.obj.execute)
    self.obj.intReady.connect(self.refreshUI)


