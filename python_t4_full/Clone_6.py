def second_largest(numbers) :
	count = 0
	m1 = m2 = float('-inf')
	for x in numbers :
		count += 1
		if x > m2 :
			if x > = m1 :
				m1, m2 = x, m1
			else :
				m2 = x
	return m2 if count > = 2 else None


 def second_largest(numbers):
  m1, m2 = float('-inf'), float('-inf')
  if len(numbers) < 2:
    return None
  for item in numbers:
    if item > m1:
      m1, m2 = item, m1
  return m2
  


