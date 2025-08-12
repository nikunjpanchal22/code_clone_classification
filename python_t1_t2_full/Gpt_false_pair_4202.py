def __init__(self, parent = None) :
	super(AppRemovalPage, self).__init__(parent = parent)
	self.setTitle('Apps to Remove')
	self.setSubTitle('Listview')
	self.list_view = QtGui.QListView(self)
	self.list_view.setMinimumSize(465, 200)
	layout = QtGui.QVBoxLayout(self)
	layout.addWidget(self.list_view)
	self.setLayout(layout)
	self.items = []
	self.isWritten = False
	loo = "/home/test1/file.txt"
	self.model = QtGui.QStandardItemModel(self.list_view)
	self.model.itemChanged.connect(self.setItems)
	file = QtCore.QFile(loo)
	if file.open(QtCore.QFile.ReadOnly | QtCore.QFile.Text) :
		while not file.atEnd() :
			line = bytearray(file.readLine()).decode().strip()
			item = QtGui.QStandardItem(line)
			item.setCheckable(True)
			item.setCheckState(QtCore.Qt.Unchecked)
			self.model.appendRow(item)
	self.list_view.setModel(self.model)
	self.list_view.show()




def __init__(self, parent = None) :
	super(AppRemovalPage, self).__init__(parent = parent)
	self.setTitle('Apps to Remove')
	self.setSubTitle('Listview')
	self.list_view = QtGui.QListView(self)
	self.list_view.setMinimumSize(465, 200)
	layout = QtGui.QVBoxLayout(self)
	layout.addWidget(self.list_view)
	self.setLayout(layout)
	self.items = []
	loo = "/home/test1/file.txt"
	self.model = QtGui.QStandardItemModel(self.list_view)
	self.model.itemChanged.connect(self.setItems)
	file = QtCore.QFile(loo)
	if file.open(QtCore.QFile.ReadOnly | QtCore.QFile.Text) :
		while not file.atEnd() :
			line = bytearray(file.readLine()).decode().strip()
			item = QtGui.QStandardItem(line)
			item.setCheckable(True)
			item.setCheckState(QtCore.Qt.Unchecked)
			self.model.appendRow(item)
	self.list_view.setModel(self.model)
	self.list_view.show()
