def __init__(self) :
	super(Dialog, self).__init__()
	layoutMain = QtGui.QVBoxLayout(self)
	listWidget = QtGui.QListWidget(self)
	gripper = QtGui.QSizeGrip(listWidget)
	l = QtGui.QHBoxLayout(listWidget)
	l.setContentsMargins(0, 0, 0, 0)
	l.addWidget(gripper, 0, QtCore.Qt.AlignRight | QtCore.Qt.AlignBottom)
	layoutMain.addWidget(listWidget)
	layoutMain.addWidget(QtGui.QLabel("Test", self))
	self.setGeometry(200, 500, 200, 500)


    self.setGeometry(200, 500, 200, 500)




def __init__(self) :
    super(Dialog, self).__init__()
    mainLayout = QtGui.QVBoxLayout(self)
    widget = QtGui.QListWidget(self)
    grip = QtGui.QSizeGrip(widget)
    boxLayout = QtGui.QHBoxLayout(widget)
    boxLayout.setContentsMargins(0, 0, 0, 0)
    boxLayout.addWidget(grip, 0, QtCore.Qt.AlignRight | QtCore.Qt.AlignBottom)


