def __init__(self, parent = None) :
	super(Test, self).__init__(parent)
	self.pushButton = QtGui.QPushButton('I am in Test widget')
	layout = QtGui.QHBoxLayout()
	layout.addWidget(self.pushButton)
	self.setLayout(layout)


  def __init__(self, parent = None) :
	super(Test, self).__init__(parent)
	self.pushButton = QtGui.QPushButton('I am in Test widget')
	upperLayout = QtGui.QHBoxLayout()
	lowerLayout = QtGui.QHBoxLayout()
	upperLayout.addWidget(self.pushButton)
	mainLayout = QtGui.QVBoxLayout()
	mainLayout.addLayout(upperLayout)
	mainLayout.addLayout(lowerLayout)
	self.setLayout(mainLayout)


