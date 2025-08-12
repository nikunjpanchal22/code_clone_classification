def compress(factors) :
  result = []
  for factor in factors :
    if factor not in result : 
      result.append(factor)
  return result


 def compress(factors) :
    until_again = []
    for factor in factors:
        if factor not in until_again:
            until_again.insert(0, factor)
    return until_again
