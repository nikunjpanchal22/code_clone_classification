def __init__(self, parent = None) :
	super(Test, self).__init__(parent)
	self.pushButton = QtGui.QPushButton('I am in Test widget')
	layout = QtGui.QHBoxLayout()
	layout.addWidget(self.pushButton)
	self.setLayout(layout)


  def __init__(self, parent = None):
	super(Test, self).__init__(parent)
	self.pushButton = QtGui.QPushButton("I am in Test widget")
	layout = QtGui.QTabWidget()
	tab_1 = QtGui.QWidget()
	layout.addTab(tab_1, "Tab1")
	tab_2 = QtGui.QWidget()
	tab_2.layout = QtGui.QHBoxLayout(tab_2)
	tab_2.layout.addWidget(self.pushButton)
	layout.addTab(tab_2, "Tab2")
	self.setLayout(layout)


