def merge_sort(data) :
	if len(data) == 1 :
		return data
	middle = len(data) / / 2
	left_data = merge_sort(data [: middle])
	right_data = merge_sort(data [middle :])
	return merge(left_data, right_data)


  def merge_sort(data):
    if len(data) <= 1:
        return data
    left = []
    right = []
    for i in range(len(data)):
        if i < len(data) // 2:
            left.append(data[i])
        else:
            right.append(data[i])
    left = merge_sort(left)
    right = merge_sort(right)
    return merge(left, right)
    


