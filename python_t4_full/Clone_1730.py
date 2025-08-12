def merge_sort(data) :
	if len(data) == 1 :
		return data
	middle = len(data) / / 2
	left_data = merge_sort(data [: middle])
	right_data = merge_sort(data [middle :])
	return merge(left_data, right_data)


 def merge_sort(data):
    if(len(data) == 1): 
        return data
    
    mid = len(data)//2
    left = data[:mid] 
    right = data[mid:] 
    left_sorted = merge_sort(left) 
    right_sorted = merge_sort(right) 
    return merge(left_sorted, right_sorted)
    


