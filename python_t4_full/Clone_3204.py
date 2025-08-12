def update_model(self, index) :
	parent = self.model.itemFromIndex(index)
	for text in ["children1", "children2", "children3"] :
		children = QtGui.QStandardItem("{}_{}".format(parent.text(), text))
		parent.appendRow(children)
	self.mytreeview.expand(index)





def update_model(self, index):
    [self.model.itemFromIndex(index).appendRow(QtGui.QStandardItem(self.model.itemFromIndex(index).text() + "_children" + str(i))) for i in range(1,4)]
    self.mytreeview.expand(index)


