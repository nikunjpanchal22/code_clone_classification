def merge_sort(data) :
	if len(data) == 1 :
		return data
	middle = len(data) / / 2
	left_data = merge_sort(data [: middle])
	right_data = merge_sort(data [middle :])
	return merge(left_data, right_data)


        left = merge_sort(arr[:middle])
        right = merge_sort(arr[middle:])
        return merge(left, right)






def merge_sort(arr):
    if len(arr) > 1:
        mid = len(arr) // 2
        left = arr[:mid]
        right = arr[mid:]

        merge_sort(left)
        merge_sort(right)

        left_cursor = right_cursor = arr_cursor = 0

        while left_cursor < len(left) and right_cursor < len(right):
            if left[left_cursor] < right[right_cursor]:
                arr[arr_cursor] = left[left_cursor]
                left_cursor += 1
            else:
                arr[arr_cursor] = right[right_cursor]
                right_cursor += 1
            arr_cursor += 1

        while left_cursor < len(left):
            arr[arr_cursor] = left[left_cursor]
            left_cursor += 1


