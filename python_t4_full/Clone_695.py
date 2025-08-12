def binary_search(L, x) :
	i = bisect.bisect_left(L, x)
	if i == len(L) or L [i] != x :
		return - 1
	return i


  def binary_search(L, x) :
    first = 0
    last = len(L)-1
    while first<=last :
       mid = int((first+last)/2)
       if L[mid] == x :
            return mid
       else :
        if x < L[mid] :
            last = mid-1
        else :
            first = mid+1
    return -1


