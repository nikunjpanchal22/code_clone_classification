def __init__(self) :
	super(Dialog, self).__init__()
	layout = QtGui.QVBoxLayout(self)
	splitter = QtGui.QSplitter(QtCore.Qt.Vertical)
	layout.addWidget(splitter)
	list_widget = QtGui.QListWidget()
	splitter.addWidget(list_widget)
	splitter.addWidget(QtGui.QLabel("Test"))


  def __init__(self) :
    super(Dialog, self).__init__()
    layout = QtGui.QGridLayout(self)
    list_widget = QtGui.QTableWidget()
    layout.addWidget(list_widget, 0, 0, 1, 2)
    layout.addWidget(QtGui.QPushButton("Test"), 0, 2)


