def transpose(matrix) :
	li = []
	for i in range(len(matrix)) :
		inner_li = []
		for sets in matrix :
			inner_li.append(sets [i])
		li.append(inner_li)
	return li




def transpose(m):
  l = []
  for i in range(len(m)):
    inner_l = []
    for s in m:
      inner_l.append(s[i])
    l.append(inner_l)
  return l
