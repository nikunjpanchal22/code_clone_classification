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
		# Set the file path
			path = "/home/test1/checked.txt"
			# Select the write/append mode
			if self.isWritten:
				mode = QtCore.QFile.Append
			else:
				mode = QtCore.QFile.WriteOnly
			# Ensure requested items are present
			if len(self.items) > 0 :
				# Create the file
				file = QtCore.QFile(path)
				# Open the file in the requested mode
				if file.open(mode) :
					# Iterate through the items
					for item in self.items :
						# Print out the item text
						print ('%s' % item.text())
						# Write the item to the file
						file.write(str(item.text()) + "\n")
				# Close the file
				file.close()
			# Print the execution statement
			print ("print checked items executed")


