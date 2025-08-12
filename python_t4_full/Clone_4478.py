def merge_sort(sequence) :
	if len(sequence) < 2 :
		return sequence
	mid = len(sequence) / / 2
	left_sequence = merge_sort(sequence [: mid])
	right_sequence = merge_sort(sequence [mid :])
	return merge(left_sequence, right_sequence)


    return merge(merge_sort(arr[:len(arr) // 2]), merge_sort(arr[len(arr) // 2:]))




def merge_sort(collection):
    def merge(left, right):
        result = []
        while left and right:
            result.append((left if left[0] <= right[0] else right).pop(0))
        result += left + right
        return result
    
    if len(collection) <= 1:
        return collection
    mid = len(collection) // 2
    left_collection = merge_sort(collection[:mid])
    right_collection = merge_sort(collection[mid:])
    return merge(left_collection, right_collection)



