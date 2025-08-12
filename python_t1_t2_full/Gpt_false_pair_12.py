def lone_sum(* args) :
  result = 0
  for val in args :
    if args.count(val) == 1 :
      result += val
  return result


 def lone_sum(*args):
      sum = 0
      for item in args:
        if args.count(item) == 1:
          sum = sum + item
      return sum
