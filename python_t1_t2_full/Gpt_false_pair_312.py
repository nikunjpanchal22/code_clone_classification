def compress(factors) :
  result = []
  for factor in factors :
    if factor not in result : 
      result.append(factor)
  return result


 def compress(factors) :
    until = []
    for factor in factors:
        if factor not in until:
            until.insert(len(until),factor)
    return until
