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


    hLayout = QtGui.QHBoxLayout(widget)
    hLayout.setContentsMargins(0, 0, 0, 0)
    hLayout.addWidget(sizeControl, 0, QtCore.Qt.AlignRight | QtCore.Qt.AlignBottom)
    layoutMain.addWidget(widget)
    layoutMain.addWidget(QtGui.QLabel("Code Variant 8", self))
    self.setGeometry(200, 500, 200, 500)




def __init__(self) :
    super(Dialog, self).__init__()
    vLayout = QtGui.QVBoxLayout(self)


