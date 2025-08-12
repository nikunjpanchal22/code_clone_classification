def update_model(self, index) :
	parent = self.model.itemFromIndex(index)
	for text in ["children1", "children2", "children3"] :
		children = QtGui.QStandardItem("{}_{}".format(parent.text(), text))
		parent.appendRow(children)
	self.mytreeview.expand(index)


 def update_model(self, index) :
    node = self.model.nodeFromIndex(index) 
    for text in ["children1", "children2", "children3"] : 
        child = QtGui.QStandardItem("{}_{}".format(node.text(), text)) 
        node.appendChild(child) 
    self.mytreeview.expand(index)
