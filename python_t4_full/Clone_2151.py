def pairsum_n(list1, value) :
	set1 = set(list1)
	list1 = sorted(set1)
	solution = []
	maxi = value / 2
	for i in list1 :
		if i >= maxi :
			break
		j = value - i
		if j in set1 :
			solution.append((i, j))
	return solution


 def pairsum_n(list1, value): 
    
    set1 = set(list1) 
    list1 = sorted(set1) 
    solution=[] 
    n = len(list1) 
    x=0
    y=n-1
    while (x < y): 
        if (list1[x] + list1[y] == value): 
            if list1[x] != list1[y]: 
                solution.append((list1[x], list1[y])) 
            x = x + 1
            y = y - 1
        elif (list1[x] + list1[y] > value): 
            y = y - 1
        else: 
            x = x + 1
      
    return solution


