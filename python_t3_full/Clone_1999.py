def __init__(self, parent = None) :
	super(Main, self).__init__(parent)
	self.addButton = QtGui.QPushButton('button to add other widgets')
	self.addButton.clicked.connect(self.addWidget)
	self.scrollLayout = QtGui.QFormLayout()
	self.scrollWidget = QtGui.QWidget()
	self.scrollWidget.setLayout(self.scrollLayout)
	self.scrollArea = QtGui.QScrollArea()
	self.scrollArea.setWidgetResizable(True)
	self.scrollArea.setWidget(self.scrollWidget)
	self.mainLayout = QtGui.QVBoxLayout()
	self.mainLayout.addWidget(self.addButton)
	self.mainLayout.addWidget(self.scrollArea)
	self.centralWidget = QtGui.QWidget()
	self.centralWidget.setLayout(self.mainLayout)
	self.setCentralWidget(self.centralWidget)



def __init__(self, parent=None):
    super(Main, self).__init__(parent)
    self.addButton = QtGui.QPushButton('Add Widget')
    self.addButton.clicked.connect(self.addWidget)
    self.scrollLayout = QtGui.QStackedLayout()
    self.scrollWidget = QtGui.QGroupBox()
    self.scrollWidget.setLayout(self.scrollLayout)
    self.scrollArea = QtGui.QScrollArea()
    self.scrollArea.setWidgetResizable(False)
    self.scrollArea.setWidget(self.scrollWidget)
    self.setCentralWidget(QtGui.QWidget(self.scrollArea))




