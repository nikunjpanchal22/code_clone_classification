def bubble(arr) :
	l = len(arr)
	for a in range(l) :
		for b in range(l - 1) :
			if (arr [a] < arr [b]) :
			arr [a], arr [b] = arr [b], arr [a]
	return arr



 def bubble(sorted_list) :
    for i in range(len(sorted_list)):
        for j in range(len(sorted_list)-1):
            if(sorted_list[j] > sorted_list[j+1]):
                sorted_list[j], sorted_list[j+1] = sorted_list[j+1], sorted_list[j]


