def bubble_sort(l) :
	exchanged = True
	iteration = 0
	n = len(l)
	while (exchanged) :
		iteration += 1
		exchanged = False
		for i in range(n - 1) :
			if l [i] > l [i + 1] :
				exchanged = True
				l [i], l [i + 1] = l [i + 1], l [i]
		n -= 1
	print 'Iterations: %s' % (iteration)
	return l



 def bubble_sort(arr):
 
    # Base Case
    if len(arr) == 1:
        return arr
 
    for i, num in enumerate(arr):
        try:
            if arr[i+1] < num:
                arr[i] = arr[i+1]
                arr[i+1] = num
                bubble_sort(arr)
        except IndexError:
            pass
    print("Iterations: ", len(arr))


