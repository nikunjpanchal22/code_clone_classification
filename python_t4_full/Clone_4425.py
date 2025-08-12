def merge_sort(data) :
	if len(data) == 1 :
		return data
	middle = len(data) / / 2
	left_data = merge_sort(data [: middle])
	right_data = merge_sort(data [middle :])
	return merge(left_data, right_data)


            k += 1

    return data




def merge_sort(arr):
    def merge(left, right):
        stack = []
        while left and right:
            if left[0] < right[0]:
                stack.append(left.pop(0))
            else:
                stack.append(right.pop(0))
        stack.extend(left[::-1] or right[::-1])

        return stack
    
    if len(arr) <= 1:
        return arr
    mid = len(arr) // 2
    left, right = merge_sort(arr[:mid]), merge_sort(arr[mid:])


