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


	hBox.setMargin(1)
	hBox.setSpacing(1)




def __init__(self, parent) :
	super(MyInterpreter, self).__init__(parent)
	hBox = QHBoxLayout()
	self.setLayout(hBox)
	self.textField = PyInterp(self)
	self.textField.initInterpreter(locals())


