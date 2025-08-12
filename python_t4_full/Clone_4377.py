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




from collections import deque

def merge(left_side, right_side):
    left_side, right_side = deque(left_side), deque(right_side)
    result=[]
    while left_side and right_side:
        result.append(left_side.popleft() if left_side[0] <= right_side[0] else right_side.popleft())


