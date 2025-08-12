def mergeSort(L, compare = operator.lt) :
	if len(L) < 2 :
		return L [:]
	else :
		middle = int(len(L) / 2)
		left = mergeSort(L [: middle], compare)
		right = mergeSort(L [middle :], compare)
		return merge(left, right, compare)


    # Then merge the now-sorted sublists. O(n)
    return merge(left, right)




def merge_sort(list):
    if len(list) < 2:
        return list



