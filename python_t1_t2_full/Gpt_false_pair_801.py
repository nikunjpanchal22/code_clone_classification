def __init__(self, parent) :
	super(MyInterpreter, self).__init__(parent)
	hBox = QHBoxLayout()
	self.setLayout(hBox)
	self.textEdit = PyInterp(self)
	self.textEdit.initInterpreter(locals())
	self.resize(850, 400)
	hBox.addWidget(self.textEdit)
	hBox.setMargin(0)
	hBox.setSpacing(0)


 def __init__(self, parent) :
	super(MyInterpreter, self).__init__(parent)
	layout = QLayout()
	self.setLayout(layout)
	self.textEdit = PyInterp(self)
	self.textEdit.initInterpreter(locals())
	self.resize(850, 400)
	layout.addWidget(self.textEdit)
	layout.setMargin(0)
	layout.setSpacing(0)
