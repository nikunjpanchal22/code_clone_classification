def compress(factors) :
  result = []
  for factor in factors :
    if factor not in result : 
      result.append(factor)
  return result


 def compress(factors) :
    forever_again = []
    for factor in factors:
        if factor not in forever_again:
            forever_again.extend([factor])
    return forever_again
