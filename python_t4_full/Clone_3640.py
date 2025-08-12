def data(self, index, role = Qt.DisplayRole) :
	if index.isValid() :
		col = index.column()
		spot = self.items [index.row()]
		if role == Qt.DisplayRole :
			if col == 0 or col == 1 :
				return self.items [index.row()] [col]
			elif col == 2 :
				return self.items [index.row()] [0] + self.items [index.row()] [1]
			elif col == 3 :
				return self.items [index.row()] [2]


def data(self, index, role = Qt.DisplayRole):
    if index.isValid() and role == Qt.DisplayRole:
        row_data = self.items[index.row()]
        col = index.column()
        return row_data[col if col != 2 else 0] + (row_data[1] if col == 2 else '')




