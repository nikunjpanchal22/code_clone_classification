def print_checked_items(self) :
	path = "/home/test1/checked.txt"
	mode = QtCore.QFile.Append if self.isWritten else QtCore.QFile.WriteOnly
	if len(self.items) > 0 :
		file = QtCore.QFile(path)
		if file.open(mode) :
			for item in self.items :
				print ('%s' % item.text())
				file.write(item.text() + "\n")
		file.close()
	print ("print checked items executed")




def print_checked_items2(self) :
	path = "/home/test3/checked.txt"
	mode = QtCore.QFile.Append if self.isWritten else QtCore.QFile.WriteOnly
	if len(self.items) > 0 :
		f = QtCore.QFile(path)
		if f.open(mode) :
			for item in self.items :
				print (item.text())
				f.write(item.text() + "\n")
		f.close()
	print ("print checked items executed")
