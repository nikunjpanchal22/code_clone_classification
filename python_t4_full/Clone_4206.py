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
    QtGui.QTabWidget.__init__(self, parent)
    self.treeWidget = QtGui.QTreeView(self)
    self.model = QtGui.QStandardItemModel()
    self.treeWidget.setModel(self.model)
    self.properties = QtGui.QStandardItem("Properties")
    self.model.setItem(0, 0, self.properties)
    self.step = QtGui.QStandardItem("Iteration #")
    self.properties.appendRow(self.step)
    self.thread = QtCore.QThread(self)
    this_worker.moveToThread(self.thread)
    this_worker.signal.connect(self.update)
    this_worker.finished.connect(self.thread.quit)
    self.start.connect(this_worker.start)


