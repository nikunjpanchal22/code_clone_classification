def __init__(self) :
	super(Dialog, self).__init__()
	layout = QtGui.QVBoxLayout(self)
	splitter = QtGui.QSplitter(QtCore.Qt.Vertical)
	layout.addWidget(splitter)
	list_widget = QtGui.QListWidget()
	splitter.addWidget(list_widget)
	splitter.addWidget(QtGui.QLabel("Test"))


 def __init__(self):
	super(Dialog, self).__init__()
	forml = QtGui.QFormLayout(self)
	splitter = QtGui.QSplitter(QtCore.Qt.Vertical)
	forml.addRow(splitter)
	list_widget = QtGui.QListWidget()
	splitter.addWidget(list_widget)
	splitter.addWidget(QtGui.QPushButton('Test'))
