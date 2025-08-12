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
    grip = QtGui.QSizeGrip(listWidget)
    gripLayout = QtGui.QHBoxLayout(listWidget)
    gripLayout.addWidget(grip, 0, QtCore.Qt.AlignRight | QtCore.Qt.AlignBottom)
    gripLayout.setContentsMargins(0, 0, 0, 0)
    self.setGeometry(200, 500, 200, 500)


