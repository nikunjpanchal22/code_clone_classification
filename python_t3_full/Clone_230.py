def __init__(self, parent = None) :
	super(Test, self).__init__(parent)
	self.pushButton = QtGui.QPushButton('I am in Test widget')
	layout = QtGui.QHBoxLayout()
	layout.addWidget(self.pushButton)
	self.setLayout(layout)


  def __init__(self, parent = None):
	super(Test, self).__init__(parent)
	self.pushButton = QtGui.QPushButton("I am in Test widget")
	layout = QtGui.QScrollArea()
	layout.scrollAreaWidgetContents = QtGui.QWidget()
	layout.scrollAreaWidgetContents.layout = QtGui.QHBoxLayout(layout.scrollAreaWidgetContents)
	layout.scrollAreaWidgetContents.layout.addWidget(self.pushButton)
	layout.setWidget(layout.scrollAreaWidgetContents)
	self.setLayout(layout)


