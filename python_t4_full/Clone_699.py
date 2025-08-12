def binary_search(L, x) :
	i = bisect.bisect_left(L, x)
	if i == len(L) or L [i] != x :
		return - 1
	return i


 def binary_search(L, x):
    start=0
    end=len(L)-1
    while start <= end:
        mid=int((start+end)/2)
        if x==L[mid]: 
            return mid
        if x>L[mid]:
            start=mid+1
        if x<L[mid]:
            end=mid-1
    return -1


