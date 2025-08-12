def update_model(self, index) :
	parent = self.model.itemFromIndex(index)
	for text in ["children1", "children2", "children3"] :
		children = QtGui.QStandardItem("{}_{}".format(parent.text(), text))
		parent.appendRow(children)
	self.mytreeview.expand(index)





def update_model(self, index):
    n1, n2, n3 = "children1", "children2", "children3"
    parent = self.model.itemFromIndex(index)
    for childname in [n1, n2, n3]:
        child = QtGui.QStandardItem(parent.text() + "_" + childname)
        parent.appendRow(child)


