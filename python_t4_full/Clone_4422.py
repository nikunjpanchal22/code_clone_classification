def merge_sort(data) :
	if len(data) == 1 :
		return data
	middle = len(data) / / 2
	left_data = merge_sort(data [: middle])
	right_data = merge_sort(data [middle :])
	return merge(left_data, right_data)




def merge_sort(data):
    def merge(left_data, right_data):
        sorted_data = []
        while len(left_data) > 0 and len(right_data) > 0:
            if left_data[0] <= right_data[0]:
                sorted_data.append(left_data.pop(0))
            else:
                sorted_data.append(right_data.pop(0))
        sorted_data += left_data
        sorted_data += right_data
        return sorted_data

    if len(data) <= 1:
        return data
    else:
        middle = len(data) // 2
        left_data = merge_sort(data[:middle])
        right_data = merge_sort(data[middle:])
        return merge(left_data, right_data)


