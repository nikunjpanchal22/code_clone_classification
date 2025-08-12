def merge(left, right) :
	result = []
	i, j = 0, 0
	while i < len(left) and j < len(right) :
		if left [i] < right [j] :
			result.append(left [i])
			i += 1
		else :
			result.append(right [j])
			j += 1
	result.extend(left [i :])
	result.extend(right [j :])
	return result


  def merge(left, right):
    answer_list = []
    i = 0
    j = 0
    while i<len(left) and j<len(right):
        element_left = left[i]
        element_right = right[j]
        if element_left <= element_right:
            answer_list.append(element_left)
            i+=1
        else:
            answer_list.append(element_right)
            j+=1
    #add remaining item if any
    while i < len(left):
        answer_list.append(left[i])
        i+=1
    while j < len(right):
        answer_list.append(right[j])
        j+=1
    return answer_list


