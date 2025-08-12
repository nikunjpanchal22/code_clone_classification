def SumOdds(x, y) :
	count = 0
	for i in range(x, y + 1) :
		if i % 2 == 1 :
			count = count + i
	print (count)


 def add_odds(start, stop):
    answer = 0
    for i in range(start, stop + 1):
        if i % 2 == 1:
            answer += i
    return answer


