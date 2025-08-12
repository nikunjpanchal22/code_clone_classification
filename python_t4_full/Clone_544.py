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
    for i in range(model.rowCount()):
        for j in range(model.columnCount()):
            ix = model.index(i, j)
            self.view.selectionModel().select(ix, QItemSelectionModel.Toggle)
    list_of_selected_rows = [QPersistentModelIndex(index) for index in self.view.selectionModel().selectedRows()] #List Comprehension
    while list_of_selected_rows.__len__() != 0: #While not empty
        index = list_of_selected_rows.pop() #Extract the last element from selected_rows


