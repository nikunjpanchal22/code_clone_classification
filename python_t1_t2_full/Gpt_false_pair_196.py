def update_model(self, index) :
	parent = self.model.itemFromIndex(index)
	for text in ["children1", "children2", "children3"] :
		children = QtGui.QStandardItem("{}_{}".format(parent.text(), text))
		parent.appendRow(children)
	self.mytreeview.expand(index)


 def update_model(self, index) :
    root = self.model.itemFromIndex(index) 
    for text in ["children1", "children2", "children3"] :
        kid = QtGui.QStandardItem("{}_{}".format(root.text(), text)) 
        root.appendRow(kid) 
    self.mytreeview.expand(index)
