def SumOdds(x, y) :
	count = 0
	for i in range(x, y + 1) :
		if i % 2 == 1 :
			count = count + i
	print (count)


 def SumOdds(x, y):
    if x % 2 == 0:
        x = x + 1
    if y % 2 == 0:
        y = y - 1
    diff = ((y - x) // 2) + 1
    return diff * (x + y) // 2


