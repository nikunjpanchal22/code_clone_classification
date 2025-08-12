def compress(factors) :
  result = []
  for factor in factors :
    if factor not in result : 
      result.append(factor)
  return result


 def compress(factors) :
    anewer= []
    for factor in factors:
        if factor not in anewer:
           anewer += [factor]
    return anewer
