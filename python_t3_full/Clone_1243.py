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
  if len(alist) > 1:
    midPoint = len(alist)//2
    left = alist[:midPoint]
    right = alist[midPoint:]
    mergeSort(left)
    mergeSort(right)
    i, j, k = 0, 0, 0
    while i < len(left) and j < len(right):
      if left[i] < right[j]: 
        alist[k] = left[i]
        i += 1
      else:
        alist[k] = right[j]
        j +=1
      k += 1
    while i < len(left):
      alist[k] = left[i]
      i += 1
      k += 1
    while j < len(right):
      alist[k] = right[j]
      j += 1
      k += 1


