def lone_sum(* args) :
  result = 0
  for val in args :
    if args.count(val) == 1 :
      result += val
  return result


 def lone_sum(*args): 
      accumulation = 0 
      for value in args: 
        if args.count(value) == 1: 
          accumulation += value 
      return accumulation
