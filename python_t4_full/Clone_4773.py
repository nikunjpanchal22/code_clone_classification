def __init__(self, parent = None) :
	super(MainWindow, self).__init__(parent)
	layout = QtWidgets.QHBoxLayout(self)
	menu_btn = QtWidgets.QPushButton()
	open_list_btn = QtWidgets.QPushButton('open list')
	layout.addWidget(menu_btn)
	layout.addWidget(open_list_btn)
	menu = QtWidgets.QMenu()
	menu_btn.setMenu(menu)
	self.menu_manager = MenuManager("menu_items", "Menu")
	menu.addMenu(self.menu_manager.menu)
	self.menu_manager.menu.triggered.connect(self.menu_clicked)
	open_list_btn.clicked.connect(self.menu_manager.show)






def __init__(self, parent=None):
    super(MainWindow, self).__init__(parent)
    layout = QtWidgets.QGridLayout(self)


