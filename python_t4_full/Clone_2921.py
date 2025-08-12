def SumOdds(x, y) :
	count = 0
	for i in range(x, y + 1) :
		if i % 2 == 1 :
			count = count + i
	print (count)


 def SumOdds(x,y):
    ans = 0
    while (x < y+1):
        if (x%2 != 0):
            ans += x
        x+=1

    return ans


