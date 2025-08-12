def listFunc(lst) :
	if len(lst) == 0 : return ''
	if len(lst) == 1 : return lst [0]
	firstPart = lst [: - 1]
	retFirst = ", ".join(firstPart)
	retSecond = ", and " + lst [- 1]
	return retFirst + retSecond


  def listFunc(lst) :
        if not lst :
            return ' '
        firstPart = lst[:-1]
        if not lst[:-1] :
            return lst[-1]
        retFirst = ' & '.join(firstPart)
        retSecond = ' & ' + lst[-1]
        return retFirst + retSecond


