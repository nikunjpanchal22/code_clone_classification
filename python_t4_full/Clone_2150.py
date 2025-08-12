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
    i =0
    j=n-1
    while(i<j): 
        if (list1[i] + list1[j] < value): 
            i=i+1
          
        elif(list1[i] + list1[j] > value): 
            j=j-1
          
        else: 
            if list1[i] != list1[j]: 
                solution.append((list1[i], list1[j])) 
            i = i + 1
            j = j - 1
          
    return solution


