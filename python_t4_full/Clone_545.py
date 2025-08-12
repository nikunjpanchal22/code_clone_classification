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



 def invertSelectionRemoveSelected(self) :
    for row in reversed(list(range(model.rowCount()))):
        for col in reversed(list(range(model.columnCount()))):
            ix = model.index(row, col)
            self.view.selectionModel().select(ix, QItemSelectionModel.Toggle)
    rows_to_delete = [QPersistentModelIndex(index) for index in self.view.selectionModel().selectedRows()] #List Comprehension
    while rows_to_delete: # while rows_to_delete is not empty
        index = rows_to_delete.pop() # remove last index


