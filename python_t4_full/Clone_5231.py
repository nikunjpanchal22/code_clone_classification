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


    layoutHor.addWidget(gripSizing, 0, QtCore.Qt.AlignRight | QtCore.Qt.AlignBottom)
    layoutVert.addWidget(widgetList)
    layoutVert.addWidget(QtGui.QLabel("Code Variant 6", self))
    self.setGeometry(200, 500, 200, 500)




def __init__(self) :
    super(Dialog, self).__init__()
    majorLayout = QtGui.QVBoxLayout(self)
    listField = QtGui.QListWidget(self)
    sizer = QtGui.QSizeGrip(listField)


