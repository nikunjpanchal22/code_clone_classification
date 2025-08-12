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
    layout = QtGui.QTabWidget(self)
    list_widget = QtGui.QTableView()
    layout.addWidget(list_widget)
    layout.addTab(QtGui.QLabel("Test"), "Tab1")


