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


def check_brackets( string ):
  _stack = []

  for c in string:
    if c == '(':
      _stack.append(c)
    elif c == ')':
      if not _stack:
        return False
      else:
        _stack.pop()

  return len(_stack) == 0



