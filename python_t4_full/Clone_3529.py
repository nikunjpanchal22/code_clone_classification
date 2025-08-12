def invertSelectionRemoveSelected(self) :
	model = self.view.model()
	for i in range(model.rowCount()) :
		for j in range(model.columnCount()) :
			ix = model.index(i, j)
			self.view.selectionModel().select(ix, QItemSelectionModel.Toggle)
	index_list = []
	for model_index in self.view.selectionModel().selectedRows() :
		index = QPersistentModelIndex(model_index)
		index_list.append(index)
	for index in index_list :
		model.removeRow(index.row())



def invertSelectionRemoveSelected(self):
    model = self.view.model()

    [self.view.selectionModel().select(model.index(i, j), 
                                       QItemSelectionModel.Toggle) 
     for i, j in itertools.product(range(model.rowCount()), range(model.columnCount()))]

    [model.removeRow(QPersistentModelIndex(model_index).row()) 
     for model_index in self.view.selectionModel().selectedRows()]




