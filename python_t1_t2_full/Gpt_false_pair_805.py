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
	spacerItem = QSpacerItem(850, 400, QSizePolicy.Expanding, QSizePolicy.Expanding)
	self.textEdit = PyInterp(self)
	self.textEdit.initInterpreter(locals())
	self.resize(850, 400)
	spacerItem.addWidget(self.textEdit) 
	spacerItem.setMargin(0)
	spacerItem.setSpacing(0)
