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
		# Define the file path
		path = "/home/test1/checked.txt"
		# Select appropriate mode
		mode = QtCore.QFile.Append if self.isWritten else QtCore.QFile.WriteOnly
		# Ensure items are present
		if len(self.items) > 0 :
			# Create file object
			file = QtCore.QFile(path)
			if file.open(mode) :
				# Print each item and write to file
				for item in self.items :
					print ('%s' % item.text())
					file.write(str(item.text()) + '\n')
			file.close()
		print ("print checked items executed")
