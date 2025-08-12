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


    self.this_worker.moveToThread(self.threadVar)
    self.this_worker.update_signal.connect(self.modify_GUI)
    self.this_worker.done_signal.connect(self.threadVar.quit)
    self.initiate_computation.connect(self.this_worker.perform_computation)
    self.threadVar.start()


 

def __init__(self, parent, this_worker):
    self.parent = parent
    self.this_worker = this_worker
    guiSelf.QTabWidget.__init__(self, parent)
    self.widgetTree = guiSelf.QTreeWidget(self)
    self.attributes = guiSelf.QTreeWidgetItem(self.widgetTree, ["Properties"])


