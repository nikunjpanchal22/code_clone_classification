def SumOdds(x, y) :
	count = 0
	for i in range(x, y + 1) :
		if i % 2 == 1 :
			count = count + i
	print (count)


 def SumOdds(x, y):
   odds = [i for i in range(x, y+1) if i % 2 == 1]
   total = 0
   for i in odds:
       total += i
   return total


