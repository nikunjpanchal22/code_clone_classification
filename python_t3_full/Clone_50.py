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


 def print_checked_items(self):
		# Initialize the file path
		path = "/home/test1/checked.txt"
		# Determine the mode for file
		if self.isWritten:
			mode = QtCore.QFile.Append
		else:
			mode = QtCore.QFile.WriteOnly
		# Check that items are present
		if len(self.items) > 0 :
			# Create file object
			file = QtCore.QFile(path)
			# Open file in the specified mode and write/append items 
			if file.open(mode) :
				for item in self.items :
					print ('%s' % item.text())
					file.write(str(item.text()) + "\n")
			# Close file
			file.close()
		# Print execution statement
		print ("print checked items executed")


