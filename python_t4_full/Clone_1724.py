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


 def merge(left,right):
    l=len(left)
    r=len(right)
    lst=[]
    i=j=0
    while i<l and j<r:
        if left[i]<=right[j]:
            lst.append(left[i])
            i+=1
        else:
            lst.append(right[j])
            j+=1
    while i<l:
        lst.append(left[i])
        i+=1
    while j<r:
        lst.append(right[j])
        j+=1
    return lst


