def __init__(self, parent = None) :
	super().__init__(parent)
	self.log_txt = QtWidgets.QPlainTextEdit(self)
	self.log_txt.setReadOnly(True)
	layout = QtWidgets.QHBoxLayout(self)
	layout.addWidget(self.log_txt)
	self.setWindowTitle('Event Log')





def __init__(self, parent=None):
    super().__init__(parent)
    self.log_txt = QtWidgets.QLineEdit(self)
    layout = QtWidgets.QVBoxLayout(self)
    layout.addWidget(self.log_txt)
    self.log_txt.setReadOnly(True)


