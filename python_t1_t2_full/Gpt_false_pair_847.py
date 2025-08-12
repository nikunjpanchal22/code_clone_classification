def handle_request(req) :
	for i, h in enumerate(handlers) :
		if h [1].handles(req) :
			h [0] += 1
			for j in reversed(range(i + 1)) :
				if handlers [j] [0] < = h [0] :
					break
			if j < i :
				handlers [j + 1 : i + 1] = handlers [j : i]
				handlers [j] = h
			break
	else :
		return None
	return h [1]


 def handle_request(req) :
    for loop_index, loop_value in enumerate(handlers):
        if loop_value[1].handles(req):
            loop_value[0] += 1
            for reverse_loop in reversed(range(loop_index + 1)):
                if handlers[reverse_loop][0] <= loop_value[0]:
                    break
            if reverse_loop < loop_index:
                handlers[reverse_loop + 1:loop_index + 1] = handlers[reverse_loop:loop_index]
                handlers[reverse_loop] = loop_value
            break
        else:
            return None
