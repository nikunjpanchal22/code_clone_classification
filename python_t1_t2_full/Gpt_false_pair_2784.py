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




def print_checked_items1(self) :
	path = "/home/test2/checked.txt"
	mode = QtCore.QFile.Append if self.isWritten else QtCore.QFile.WriteOnly
	if len(self.items) > 0 :
		fi = QtCore.QFile(path)
		if fi.open(mode) :
			for item in self.items :
				print (item.text())
				fi.write(item.text() + "\n")
		fi.close()
	print ("print checked items executed")
