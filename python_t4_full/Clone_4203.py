def __init__(self, parent, this_worker) :
	self.parent = parent
	self.this_worker = this_worker
	QtGui.QTabWidget.__init__(self, parent)
	self.treeWidget = QtGui.QTreeWidget(self)
	self.properties = QtGui.QTreeWidgetItem(self.treeWidget, ["Properties"])
	self.step = QtGui.QTreeWidgetItem(self.properties, ["Iteration #"])
	self.thread = QtCore.QThread();
	self.this_worker.moveToThread(self.thread);
	self.this_worker.update_signal.connect(self.update_GUI)
	self.this_worker.done_signal.connect(self.thread.quit)
	self.start_comp.connect(self.this_worker.start_computation)
	self.thread.start()


    self.initiate_comp.connect(self.this_worker.initiate_processing)
    self.run.start()


 

def __init__(self, parent, this_worker) :
    self.parent = parent
    self.this_worker = this_worker
    PyQt5.QtWidgets.QTabWidget.__init__(self, parent)
    self.nodeDisplay = PyQt5.QtWidgets.QTreeWidget(self)
    self.details = PyQt5.QtWidgets.QTreeWidgetItem(self.nodeDisplay, ["Details"])
    self.loopCount = PyQt5.QtWidgets.QTreeWidgetItem(self.details, ["Iteration #"])
    self.stream = QtCore.QThread()
    self.this_worker.moveToThread(self.stream)


