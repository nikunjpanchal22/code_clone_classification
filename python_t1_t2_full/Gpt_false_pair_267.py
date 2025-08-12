def __init__(self, parent = None) :
	super(Test, self).__init__(parent)
	self.pushButton = QtGui.QPushButton('I am in Test widget')
	layout = QtGui.QHBoxLayout()
	layout.addWidget(self.pushButton)
	self.setLayout(layout)


  def __init__(self, parent = None):
	super(Test, self).__init__(parent)
	self.pushButton = QtGui.QPushButton("I am in Test widget")
	layout = QtGui.QGridLayout()
	layout.addWidget(self.pushButton, 0, 0, 1, 1)
	self.setLayout(layout)
