def SumOdds(x, y) :
	count = 0
	for i in range(x, y + 1) :
		if i % 2 == 1 :
			count = count + i
	print (count)


 def SumOdds(x, y):
    odds = [i for i in range(x, y+1) if i % 2 == 1]
    return sum(odds)


