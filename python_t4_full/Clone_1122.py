def bubble(arr) :
	l = len(arr)
	for a in range(l) :
		for b in range(l - 1) :
			if (arr [a] < arr [b]) :
			arr [a], arr [b] = arr [b], arr [a]
	return arr



 def bubble_sort(lst):
	swap_happened = True
	while swap_happened:
		swap_happened = False
		for num in range(len(lst) - 1):
			if lst[num] > lst[num + 1]:
				lst[num], lst[num + 1] = lst[num + 1], lst[num]
				swap_happened = True


