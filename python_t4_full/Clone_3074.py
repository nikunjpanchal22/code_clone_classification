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


    print("print checked items executed")

    



def print_checked_items(self):
    path = "/home/test1/checked.txt"
    mode = 'a+' if self.isWritten else 'w'
    try:
        with open(path, mode) as file:
            file.write('\n'.join(item.text() for item in self.items))
    except Exception as e:
        print(f"Error occurred: {e}")


