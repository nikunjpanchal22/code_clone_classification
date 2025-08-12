def __init__(self, parent = None) :
	super().__init__(parent)
	self.log_txt = QtWidgets.QPlainTextEdit(self)
	self.log_txt.setReadOnly(True)
	layout = QtWidgets.QHBoxLayout(self)
	layout.addWidget(self.log_txt)
	self.setWindowTitle('Event Log')


 def __init__(self, parent = None):
        super().__init__(parent)
        self.log_txt = QtWidgets.QPlainTextEdit(self)
        self.log_txt.setReadOnly(True)
        layout = QtWidgets.QTabWidget(self)
        layout.addTab(self.log_txt, 'Log')
        self.setWindowTitle('Event Log')
