def binary_search(L, x) :
	i = bisect.bisect_left(L, x)
	if i == len(L) or L [i] != x :
		return - 1
	return i


  def binary_search(L, x): 
      left = 0
      right = len(L)-1
      while left <= right: 
        mid = (left + right)//2
        if L[mid] == x: 
          return mid 
        elif L[mid] > x:
            right = mid - 1
        else:
             left = mid + 1 
      else: 
           return -1


