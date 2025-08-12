def compress(factors) :
  result = []
  for factor in factors :
    if factor not in result : 
      result.append(factor)
  return result


 def compress(factors) :
    over_and_over = []
    for factor in factors:
        if factor not in over_and_over:
            over_and_over += [factor] 
    return over_and_over
