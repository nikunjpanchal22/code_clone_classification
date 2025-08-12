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


    cost = total*5.5 if total > 0 else 0
    cost += min(5.5, rem*0.0208)
    return cost


def get_cost(x):
    duration = x['t1']
    return (duration // 720)*5.5 + min(5.5, (duration % 720) * 0.0208)


def get_cost(x):
    duration = x['t1']
    cost = 0
    while(duration>=720):
        duration -= 720
        cost +=5.5
    cost += min(duration*0.0208, 5.5)


