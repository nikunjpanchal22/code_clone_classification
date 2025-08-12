def update_model(self, index) :
	parent = self.model.itemFromIndex(index)
	for text in ["children1", "children2", "children3"] :
		children = QtGui.QStandardItem("{}_{}".format(parent.text(), text))
		parent.appendRow(children)
	self.mytreeview.expand(index)


 def update_model(self, index) :
    ancestor = self.model.itemFromIndex(index)
    for text in ["children1", "children2", "children3"] :
        descendant = QtGui.QStandardItem("{}_{}".format(ancestor.text(), text)) 
        ancestor.appendRow(descendant)
    self.mytreeview.expand(index)
