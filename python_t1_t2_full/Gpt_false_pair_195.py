def update_model(self, index) :
	parent = self.model.itemFromIndex(index)
	for text in ["children1", "children2", "children3"] :
		children = QtGui.QStandardItem("{}_{}".format(parent.text(), text))
		parent.appendRow(children)
	self.mytreeview.expand(index)


 def update_model(self, index) :
    head = self.model.itemFromIndex(index)
    for text in ["children1", "children2", "children3"] :
        offspring = QtGui.QStandardItem("{}_{}".format(head.text(), text)) 
        head.appendRow(offspring)
    self.mytreeview.expand(index)
