def merge_sort(data) :
	if len(data) == 1 :
		return data
	middle = len(data) / / 2
	left_data = merge_sort(data [: middle])
	right_data = merge_sort(data [middle :])
	return merge(left_data, right_data)






def MergeSort(arr):
    if len(arr) <= 1:
        return arr
    else:
        mid = len(arr) // 2
        left = MergeSort(arr[:mid])
        right = MergeSort(arr[mid:])


