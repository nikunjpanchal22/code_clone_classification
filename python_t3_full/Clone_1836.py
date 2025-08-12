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
		if node:
			right, left = node[1], node[2]
			if not left:
				node[1].append[v, [], []]
			elif not right :
				node[2].append[v, [], []]
			else :
				_add(left, v)
		else :
			node[:].append([v, [], []])


