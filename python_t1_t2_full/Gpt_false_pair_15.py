def lone_sum(* args) :
  result = 0
  for val in args :
    if args.count(val) == 1 :
      result += val
  return result


 def lone_sum(*args): 
      result = 0
      for x in args:
        if args.count(x) == 1:
          result = result + x
      return result
