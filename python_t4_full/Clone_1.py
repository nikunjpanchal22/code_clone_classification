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

  if len(numbers) < 2:
    return None

  m1 = max(numbers[0], numbers[1])
  m2 = min(numbers[0], numbers[1])
  
  for x in numbers:
    if x > m1:
      m2 = m1
      m1 = x
    elif m2 < x < m1:
      m2 = x
  return m2


