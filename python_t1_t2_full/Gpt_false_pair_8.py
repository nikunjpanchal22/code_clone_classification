def lone_sum(* args) :
  result = 0
  for val in args :
    if args.count(val) == 1 :
      result += val
  return result


 def lone_sum(*args): 
      accumulator = 0 
      for element in args:
        if args.count(element) == 1:
          accumulator = accumulator + element
      return accumulator 
