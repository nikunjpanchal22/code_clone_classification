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




def __init__(self, parent, this_worker):
    self.parent = parent
    self.this_worker = this_worker
    super().__init__(parent)
    self.treeWidget = QtWidgets.QTreeWidget(self)
    self.properties = QtWidgets.QTreeWidgetItem(self.treeWidget)
    self.step = QtWidgets.QTreeWidgetItem(self.properties)
    self.thread = QtCore.QThread(self)
    self.this_worker.moveToThread(self.thread)
    self.this_worker.signal.connect(self.update_GUI)
    self.this_worker.signal.done.connect(self.thread.quit)
    self.start.connect(self.this_worker.start)
    self.thread.start()


