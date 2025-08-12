def printFigure(rows) :
	for x in range(rows) :
		items = [str(i) for i in range(1, x + 1)]
		if x % 2 == 0 :
			items = items [: : - 1]
		print (''.join(items))


def printFigure(rows):
    for x in range(rows):
        order = -1 if x % 2 == 0 else 1
        items = [str(i) for i in range(1, x+1)][::order]
        print(''.join(items))



