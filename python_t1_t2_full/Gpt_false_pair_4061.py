def __init__(self, parent = None) :
	super(Test, self).__init__(parent)
	self.pushButton = QtGui.QPushButton('I am in Test widget')
	layout = QtGui.QHBoxLayout()
	layout.addWidget(self.pushButton)
	self.setLayout(layout)




def __init__(self, parent = None) :
	super(Test, self).__init__(parent)
	self.checkBox = QtGui.QCheckBox('I am in Test widget')
	layout = QtGui.QHBoxLayout()
	layout.addWidget(self.checkBox)
	self.setLayout(layout)
