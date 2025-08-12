def update_model(self, index) :
	parent = self.model.itemFromIndex(index)
	for text in ["children1", "children2", "children3"] :
		children = QtGui.QStandardItem("{}_{}".format(parent.text(), text))
		parent.appendRow(children)
	self.mytreeview.expand(index)




def update_model(self, index):
    parent = self.model.itemFromIndex(index)
    for text in range(1, 4):
        children = QtGui.QStandardItem(f"{parent.text()}_children{text}")
        parent.appendRow(children)
    self.mytreeview.expand(index)


