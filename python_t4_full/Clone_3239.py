def get_cost(x) :
	t_zone = 720
	max_rate = 5.5
	rate = 0.0208
	duration = x ['t1']
	if duration < t_zone :
		if (duration * rate) > = max_rate :
			return max_rate
		else :
			return (duration * rate)
	else :
		if duration > = 720 :
			x = int(duration / 720)
			y = ((duration % 720) * rate)
			if y > = max_rate :
				return ((x * max_rate) + max_rate)
			else :
				return ((x * max_rate) + y)


    return total


def get_cost(x):
    duration = x['t1']
    n, rem = divmod(duration, 720)
    if n > 0:
        cost = n * 5.5
        if rem * 0.0208 >= 5.5:
            cost += 5.5
        else:
            cost += rem * 0.0208


