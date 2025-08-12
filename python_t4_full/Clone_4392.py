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





from typing import List

def merge(left: List[int], right: List[int]) -> List[int]:
    merged = []
    while left and right:
        merged.append(left.pop(0) if left[0] <= right[0] else right.pop(0))
    while left:
        merged.append(left.pop(0))
    while right:
        merged.append(right.pop(0))


