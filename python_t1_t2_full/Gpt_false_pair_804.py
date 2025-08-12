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
	boxLayout = QBoxLayout(QBoxLayout.LeftToRight)
	self.setLayout(boxLayout)
	self.textEdit = PyInterp(self)
	self.textEdit.initInterpreter(locals())
	self.resize(850, 400)
	boxLayout.addWidget(self.textEdit)
	boxLayout.setMargin(0)
	boxLayout.setSpacing(0)
