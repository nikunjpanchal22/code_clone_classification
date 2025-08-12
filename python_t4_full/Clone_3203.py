def update_model(self, index) :
	parent = self.model.itemFromIndex(index)
	for text in ["children1", "children2", "children3"] :
		children = QtGui.QStandardItem("{}_{}".format(parent.text(), text))
		parent.appendRow(children)
	self.mytreeview.expand(index)



def update_model(self, index):
    parent = self.model.itemFromIndex(index)
    children = [parent.appendRow(QtGui.QStandardItem("%s_children%d" % (parent.text(), i))) for i in range(1,4)]
    self.mytreeview.expand(index)


