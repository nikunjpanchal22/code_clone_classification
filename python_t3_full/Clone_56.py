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
		# Initialize file path
		path = "/home/test1/checked.txt"
		# Determine mode
		if self.isWritten :
			mode = QtCore.QFile.Append
		else :
			mode = QtCore.QFile.WriteOnly
		# Check for presence of items
		if len(self.items) > 0 :
			# Create file object
			file = QtCore.QFile(path)
			if file.open(mode) : # Open file in the specified mode
				for item in self.items :
					# Print out the item text
					print ('%s' % item.text())
					# Write the item to the file
					file.write(item.text() + "\n")
			# Close the file
			file.close()
		# Print the execution statement
		print ("print checked items executed")


