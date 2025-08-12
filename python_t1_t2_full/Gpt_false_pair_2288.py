def printFigure(rows) :
	for x in range(rows) :
		items = [str(i) for i in range(1, x + 1)]
		if x % 2 == 0 :
			items = items [: : - 1]
		print (''.join(items))




def printFigure3(rows) :
	for x in range(rows) :
		# Creates a list with every number from 1 to x + 1
		items = [str(i) for i in range(1, x + 1)]

		# Reverses the list if x is even
		if x % 2 == 0 :
			items.reverse()

		# Joins the items in the list of strings and prints the line
		print (''.join(items))
