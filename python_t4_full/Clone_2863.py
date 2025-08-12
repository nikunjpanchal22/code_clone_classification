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
		if not node :
			node.append([v, [], []])
		else:
			left, right = node[1], node[2]
			if not left:
				left.append([v, [], []])
			elif not right:
				right.append([v, [], []])
			else:
				_add(left, v)


