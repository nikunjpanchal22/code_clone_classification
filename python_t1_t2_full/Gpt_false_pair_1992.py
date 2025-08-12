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
    layout = QtGui.QHBoxLayout(self)
    splitter = QtGui.QSplitter(QtCore.Qt.Horizontal)
    layout.addWidget(splitter)
    list_widget = QtGui.QTableView()
    splitter.addWidget(list_widget)
    splitter.addWidget(QtGui.QLineEdit("Test"))
