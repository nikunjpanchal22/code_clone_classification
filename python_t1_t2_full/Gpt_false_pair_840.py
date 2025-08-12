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
    for i, v in enumerate(handlers):
        if v[1].handles(req):
            v[0] += 1
            max_i = -1
            for j in reversed(range(i+1)):
                if handlers[j][0] <= v[0]:
                    max_i = j
                    break
            if max_i < i:
                handlers[max_i+1:i+1] = handlers[max_i:i]
                handlers[max_i] = v
            break
        else:
            return None
