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


    self.this_worker.signal.finished.connect(self.thread.quit)
    self.start.connect(self.this_worker.start)
    self.thread.start()




def __init__(self, parent, this_worker):
    self.parent = parent
    self.this_worker = this_worker
    QtGui.QTabWidget.__init__(self, parent)
    self.treeWidget = QtGui.QTreeWidget(self)
    self.item1 = QTreeWidgetItem(["Properties"])
    self.treeWidget.addTopLevelItem(self.item1)
    self.item2 = QTreeWidgetItem(["Iteration #"])
    self.item1.addChild(self.item2)
    self.pushButton = QtWidgets.QPushButton(self)
    self.pushButton.setText("Start")
    self.pushButton.clicked.connect(self.on_pushButton_clicked)


