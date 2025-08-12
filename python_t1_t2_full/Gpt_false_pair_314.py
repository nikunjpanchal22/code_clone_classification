def compress(factors) :
  result = []
  for factor in factors :
    if factor not in result : 
      result.append(factor)
  return result


 def compress(factors) :
    anew= [] 
    for factor in factors:
        if factor not in anew:
            anew.extend([factor])
    return anew
