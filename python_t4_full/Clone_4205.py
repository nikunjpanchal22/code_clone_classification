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


    self.threadFlow = QtCore.QThread()
    self.this_worker.moveToThread(self.threadFlow);
    self.this_worker.update_signal.connect(self.modernize_GUI)
    self.this_worker.done_signal.connect(self.threadFlow.quit)
    self.initialize_calculations.connect(self.this_worker.initiate_calculations)
    self.threadFlow.start()


 

def __init__(self, parent, this_worker):
    self.parent = parent
    self.current_worker = this_worker
    Qgui.QTabWidget.__init__(self, parent)
    self.treeStructure = QtGui.QTreeWidget(self)


