def SumOdds(x, y) :
	count = 0
	for i in range(x, y + 1) :
		if i % 2 == 1 :
			count = count + i
	print (count)


 def SumOdds(x, y):
    total = 0
    while x <= y:
        if (x % 2 == 1):
            total += x
        x += 1
    return total


