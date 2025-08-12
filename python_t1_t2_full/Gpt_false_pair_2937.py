def _add(node, v) :
	new = [v, [], []]
	if node :
		left, right = node [1 :]
		if not left :
			left.extend(new)
		elif not right :
			right.extend(new)
		else :
			_add(left, v)
	else :
		node.extend(new)




def _add_t3(node, v) :
	new = [v, [], []]
	if node :
		left, right = node [1 :]
		if not left :
			left.append(new)
		elif not right :
			right.append(new)
		else :
			_add_t3(left, v)
	else :
		node.append(new)
