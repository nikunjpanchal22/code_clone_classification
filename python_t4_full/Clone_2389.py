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


    
    matrix = [[],[],[],[]]
    for i in range(len(mylist)):
        for j in range(len(mylist[i])):
            matrix[j].append(mylist[i][j].rjust(maxLength))
    
    for i in range(len(matrix)):
        print("".join(matrix[i]))

 
def printTable(mylist): 
	maxLength = 0
	for item in mylist: 
		for i in item: 
			if len(i) > maxLength:
				maxLength = len(i)

	myNewlist = [[],[],[],[]]
	for i in range(len(mylist)): 
		for u in range(len(mylist[i])) :
			myNewlist[u].append(mylist[i][u].rjust(maxLength))
	
	x = 0
	for i in myNewlist:
		for u in i:
			print(u,end="")
			x += 1
			if x == len(mylist) :
				print('\n', end="")
			else :
				continue


