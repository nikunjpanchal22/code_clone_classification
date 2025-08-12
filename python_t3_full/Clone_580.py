def binary_search(a, key, imin = 0, imax = None) :
	if imax is None :
		imax = len(a) - 1
	while imin < = imax :
		mid = (imin + imax) / / 2
		midval = a [mid]
		if midval < key :
			imin = mid + 1
		elif midval > key :
			imax = mid - 1
		else :
			return mid
	raise ValueError


  def binary_search(a, key, imin=0, imax=None): 
        if imax is None: 
            imax = len(a) - 1
        while imin <= imax: 
            mid = (imin + imax) // 2
            midval = a[mid]
            if midval < key: 
                imin = mid + 1
            elif midval > key:
                imax = mid - 1 
            else: 
                if mid >0 and mid<len(a)-1: 
                    return mid-1, mid, mid+1 
                elif mid==0: 
                    return -1, mid, mid+1 
                else: 
                    return mid-1, mid, -1 
        raise ValueError('The given key is not in the list')


