def sublist(a, b) :
	if not a :
		return True
	for k in range(len(b)) :
		if a [0] == b [k] :
			return sublist(a [1 :], b [k + 1 :])
	return False


 def contains(listA, listB):
    if len(listA) == 0:
        return True     
    for i in range(len(listB)):
        if listA[0] == listB[i]:
            res = contains(listA[1:], listB[i+1:]) or contains(listA, listB[i+1:])
            return res
    return False


