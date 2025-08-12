def __init__(self, parent = None) :
	super(TranslucentWidget, self).__init__(parent)
	self.setWindowFlags(QtCore.Qt.FramelessWindowHint)
	self.setAttribute(QtCore.Qt.WA_TranslucentBackground)
	self.fillColor = QtGui.QColor(30, 30, 30, 120)
	self.penColor = QtGui.QColor("#333333")
	self.popup_fillColor = QtGui.QColor(240, 240, 240, 255)
	self.popup_penColor = QtGui.QColor(200, 200, 200, 255)
	self.close_btn = QtWidgets.QPushButton(self)
	self.close_btn.setText("x")
	font = QtGui.QFont()
	font.setPixelSize(18)
	font.setBold(True)
	self.close_btn.setFont(font)
	self.close_btn.setStyleSheet("background-color: rgb(0, 0, 0, 0)")
	self.close_btn.setFixedSize(30, 30)
	self.close_btn.clicked.connect(self._onclose)
	self.SIGNALS = TranslucentWidgetSignals()


	self.exit_btn.setText("E")
	self.exit_btn.clicked.connect(self._onexit)
	self.EVENTS = AppWidgetEvents()



def __init__(self, parent = None) :
	super(Dialog, self).__init__(parent)
	self.setWindowFlags(QtCore.Qt.FramelessWindowHint)
	self.setAttribute(QtCore.Qt.WA_TranslucentBackground)
	self.bgColor = QtGui.QColor(200, 200, 200, 60)


