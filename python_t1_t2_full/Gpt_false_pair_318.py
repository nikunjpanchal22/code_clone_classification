def compress(factors) :
  result = []
  for factor in factors :
    if factor not in result : 
      result.append(factor)
  return result


 def compress(factors) :
    out = []
    for factor in factors:
            if factor not in out:
                out.insert(0,factor)
    return out
