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
	stackLayout = QStackedLayout()
	self.setLayout(stackLayout)
	self.textEdit = PyInterp(self)
	self.textEdit.initInterpreter(locals())
	self.resize(850, 400)
	stackLayout.addWidget(self.textEdit)
	stackLayout.setMargin(0)
	stackLayout.setSpacing(0)	
