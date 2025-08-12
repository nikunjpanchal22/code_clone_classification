def lone_sum(* args) :
  result = 0
  for val in args :
    if args.count(val) == 1 :
      result += val
  return result


 def lone_sum(*args):
      total = 0
      for num in args:
        if args.count(num) == 1:
          total += num
      return total
