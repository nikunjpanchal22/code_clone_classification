def merge(left, right) :
	result = []
	i = j = 0
	while i < len(left) and j < len(right) :
		if left [i] < right [j] :
			result.append(left [i])
			i += 1
		else :
			result.append(right [j])
			j += 1
	result += left [i :]
	result += right [j :]
	return result


  def merge(A, B):
    merge_list = []
    i = j = 0
    while i < len(A) and j < len(B):
        if A[i] < B[j]:
            merge_list.append(A[i])
            i += 1
        else:
            merge_list.append(B[j]) 
            j += 1
    while i < len(A):
	    merge_list.append(A[i])
	    i += 1
    while j < len(B):
	    merge_list.append(B[j])
	    j += 1
    return merge_list


