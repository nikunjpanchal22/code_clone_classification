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
    for index, h in enumerate(handlers):
        if h[1].handles(req):
            h[0] += 1
    
            max_index = -1
            for counter in reversed(range(index + 1)):
                if handlers[counter][0] <= h[0]:
                    max_index = counter
                    break
            
            if max_index < index:
                # shifting the handlers before max_index
                handlers[max_index + 1:index + 1] = handlers[max_index:index]
                handlers[max_index] = h
        
            break
        else:
            return None
