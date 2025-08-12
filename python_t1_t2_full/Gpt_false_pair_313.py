def compress(factors) :
  result = []
  for factor in factors :
    if factor not in result : 
      result.append(factor)
  return result


 def compress(factors) :
    new_result = []
    for factor in factors:
      if factor not in new_result:
        new_result = new_result + [factor]
    return new_result
