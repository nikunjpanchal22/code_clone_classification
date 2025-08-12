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


 def __init__(self) :
    layout = QtGui.QVBoxLayout(self)
    listWidget = QtGui.QListWidget(self)
    layout.addWidget(listWidget)
    layout.addWidget(QtGui.QLabel("Test", self))
    handle = QtGui.QSizeGrip(listWidget)
    gridLayout = QtGui.QHBoxLayout(listWidget)
    gridLayout.setContentsMargins(0, 0, 0, 0)
    gridLayout.addWidget(handle, 0, QtCore.Qt.AlignRight | QtCore.Qt.AlignBottom)
    self.setGeometry(200, 500, 200, 500)


