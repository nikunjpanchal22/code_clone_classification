def compress(factors) :
  result = []
  for factor in factors :
    if factor not in result : 
      result.append(factor)
  return result


 def compress(factors) :
    forever = []
    for factor in factors:
        if factor not in forever:
            forever = forever + [factor]
    return forever
