def __init__(self, parent = None) :
	super().__init__(parent)
	self.log_txt = QtWidgets.QPlainTextEdit(self)
	self.log_txt.setReadOnly(True)
	layout = QtWidgets.QHBoxLayout(self)
	layout.addWidget(self.log_txt)
	self.setWindowTitle('Event Log')


 def __init__(self, parent = None):
        super().__init__(parent)
        self.log_txt = QtWidgets.QLabel(self)
        self.log_txt.setReadOnly(True)
        layout = QtWidgets.QGraphicsLinearLayout(self)
        layout.addItem(self.log_txt)
        self.setWindowTitle('Event Log')
