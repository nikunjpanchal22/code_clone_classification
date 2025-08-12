def __init__(self, parent = None) :
	super(Test, self).__init__(parent)
	self.pushButton = QtGui.QPushButton('I am in Test widget')
	layout = QtGui.QHBoxLayout()
	layout.addWidget(self.pushButton)
	self.setLayout(layout)






def __init__(self, parent = None):
    super().__init__(parent)
    self.actionButton = QtGui.QPushButton('Action')
    layout = QtGui.QFormLayout()


