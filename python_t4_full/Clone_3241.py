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




def get_cost(x):
    total = 0
    duration = x['t1']
    while duration >= 720:
        total += 5.5
        duration -= 720


