def printTable(mylist) :
	maxLength = 0
	for item in mylist :
		for i in item :
			if len(i) > maxLength :
				maxLength = len(i)
			else :
				maxLength = maxLength
	for item in mylist :
		for i in range(len(item)) :
			item [i] = (item [i].rjust(maxLength))
	myNewlist = {0 : [], 1 : [], 2 : [], 3 : []}
	for i in range(len(item)) :
		for u in tableData :
			myNewlist [i].append(u [i])
	for key, value in myNewlist.items() :
		print (''.join(value))




def printTable(mylist) :
	maxLength = 0
	for item in mylist :
		for i in item :
			if len(i) > maxLength :
				maxLength = len(i)
			else :
				maxLength = maxLength
	for item in mylist :
		for i in range(len(item)) :
			item [i] = (item [i].rjust(maxLength))
	tableData = [[x [i] for x in mylist] for i in range(len(mylist [0]))]
	for value in tableData :
		print (''.join(value))

