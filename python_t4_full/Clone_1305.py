def matched(s) :
	p_list = []
	for i in range(0, len(s)) :
		if s [i] == '(' :
			p_list.append('(')
		elif s [i] == ')' :
			if not p_list :
				return False
			else :
				p_list.pop()
	if not p_list :
		return True
	else :
		return False


  def matched(string):
    pob = list(string)
    is_Matched, pop_count, max_pob = False, 0, len(pob)-1
    for i in range(0,max_pob):
        if pob[i] == pob[max_pob-i] and (i >= max_pob-i):
            is_Matched, pop_count = True, pop_count+2
        elif pob[i] == pob[max_pob-i] and (i < max_pob-i):
            is_Matched, pop_count = True, pop_count+2
            break
    if is_Matched and pop_count-max_pob == 0:
        return True
    else:
        return False


