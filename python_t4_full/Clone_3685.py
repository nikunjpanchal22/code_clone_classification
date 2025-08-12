def solve(stickers) :
	i = 1
	while lowest_state(str(i), stickers) > = 0 :
		i *= 2
	top = i
	bottom = 0
	center = 0
	while top - bottom > 1 :
		center = (top + bottom) / 2
		if lowest_state(str(center), stickers) > = 0 :
			bottom = center
		else :
			top = center
	if lowest_state(str(top), stickers) > = 0 :
		return top
	else :
		return bottom


    return high if not lowest_state(str(high), stickers) < 0 else low



def solve(stickers):
    p = 1
    while lowest_state(str(p), stickers) >= 0:
        p = p << 1
    end = p
    start = 0
    while end - start > 1:
        mid = (end + start) // 2
        if lowest_state(str(mid), stickers) >= 0:
            start = mid


