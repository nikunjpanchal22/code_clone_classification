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


    mainLayout.addWidget(QtGui.QLabel("Code Variant 4", self))
    self.setGeometry(200, 500, 200, 500)




def __init__(self) :
    super(Dialog, self).__init__()
    layout = QtGui.QVBoxLayout(self)
    list = QtGui.QListWidget(self)
    sizeGripper = QtGui.QSizeGrip(list)
    horLayout = QtGui.QHBoxLayout(list)
    horLayout.setContentsMargins(0, 0, 0, 0)


