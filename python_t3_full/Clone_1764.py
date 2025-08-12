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
    list_widget = QtGui.QComboBox()
    layout.addWidget(list_widget)
    layout.addWidget(QtGui.QRadioButton("Test"))


