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






def _add(node, v) :
	new = [v, [], []]
	if node :
		node[1].extend(new) if not node[1] else node[2].extend(new) if not node[2] else _add(node[1], v)


