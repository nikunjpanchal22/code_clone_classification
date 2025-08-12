def merge(left_side, right_side) :
	result = []
	while len(left_side) > 0 or len(right_side) > 0 :
		if len(left_side) > 0 and len(right_side) > 0 :
			if left_side [0] < = right_side [0] :
				result.append(left_side.pop(0))
			else :
				result.append(right_side.pop(0))
		elif len(left_side) > 0 :
			result.append(left_side.pop(0))
		elif len(right_side) > 0 :
			result.append(right_side.pop(0))
	return result



def merge(l, r):
    m = []
    while l and r:
        m.append(l.pop(0) if l[0] <= r[0] else r.pop(0))
    m.extend(l if l else r)
    return m




def merge(list1, list2):
    final_list = []


