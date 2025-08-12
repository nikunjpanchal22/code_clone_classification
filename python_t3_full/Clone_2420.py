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


    layout.addWidget(list)
    layout.addWidget(QtGui.QLabel("Code Variant 5", self))
    self.setGeometry(200, 500, 200, 500)




def __init__(self) :
    super(Dialog, self).__init__()
    layoutVert = QtGui.QVBoxLayout(self)
    widgetList = QtGui.QListWidget(self)
    gripSizing = QtGui.QSizeGrip(widgetList)
    layoutHor = QtGui.QHBoxLayout(widgetList)


