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


 

def _add(node, v):
    new = [v, [], []]
    if node:
        if not node[1]:
            node[1].extend(new)
        elif not node[2]:
            node[2].extend(new)
        else:
            _add(node[1], v)
    else:
        node.extend(new)


