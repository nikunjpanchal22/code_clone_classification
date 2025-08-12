def mergeSort(alist) :
	print ("Splitting ", alist)
	if len(alist) > 1 :
		mid = len(alist) / / 2
		lefthalf = alist [: mid]
		righthalf = alist [mid :]
		mergeSort(lefthalf)
		mergeSort(righthalf)
		i = 0
		j = 0
		k = 0
		while i < len(lefthalf) and j < len(righthalf) :
			if lefthalf [i] < righthalf [j] :
				alist [k] = lefthalf [i]
				i = i + 1
			else :
				alist [k] = righthalf [j]
				j = j + 1
			k = k + 1
		while i < len(lefthalf) :
			alist [k] = lefthalf [i]
			i = i + 1
			k = k + 1
		while j < len(righthalf) :
			alist [k] = righthalf [j]
			j = j + 1
			k = k + 1
	print ("Merging ", alist)



def mergeSort(alist):
	if len(alist) <= 1 :
		return alist
	mid = len(alist) // 2
	left = mergeSort(alist[:mid])
	right = mergeSort(alist[mid:])
	result = [None]*(len(left) + len(right))
	i = j = 0
	while i < len(left) and j < len(right) :
		if left[i] > right [j] :
			result[i + j] = left[i]
			i += 1
		else :
			result[i + j] = right[j]
			j += 1
	while i < len(left) :
		result[i + j] = left[i]
		i += 1
	while j < len(right) :
		result[i + j] = right[j]
		j += 1


