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
    splitter = QtGui.QSplitter(QtCore.Qt.Horizontal)
    splitter.addWidget(QtGui.QListWidget())
    splitter.addWidget(QtGui.QLabel("Test"))
    self.setLayout(QtGui.QVBoxLayout())
    self.layout().addWidget(splitter)


