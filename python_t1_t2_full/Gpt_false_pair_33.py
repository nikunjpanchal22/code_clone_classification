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


 def print_checked_items(self) :
		path = "/home/test1/checked.txt"
		mode = QtCore.QFile.Append if self.isWritten else QtCore.QFile.WriteOnly
		if len(self.items) > 0 :
			file = QtCore.QFile(path)
			if file.open(mode) :
				for item in self.items :
					print ('%s' % item.text())
					file.write(str(item.text()) + "\n")
			file.close()
			print ("print checked items executed")
