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



 def data(self, index, role = Qt.DisplayRole) :
    if index.isValid() and role == Qt.DisplayRole :  
		col = index.column()  
		row = self.items[index.row()] 
		answers = [row[0],row[1],row[0]+row[2],row[2]]  


