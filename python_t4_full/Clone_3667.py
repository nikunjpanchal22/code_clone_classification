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


def binary_search(itemList, item, startIndex=0, endIndex=None):
    if endIndex is None: endIndex = len(itemList)-1
    while startIndex <= endIndex:
        midIndex = (startIndex + endIndex) // 2
        if itemList[midIndex] == item: return midIndex
        elif itemList[midIndex] < item: startIndex = midIndex + 1
        else: endIndex = midIndex - 1
    raise ValueError


