def lone_sum(* args) :
  result = 0
  for val in args :
    if args.count(val) == 1 :
      result += val
  return result


 def lone_sum(*args):
      sums = 0
      for num in args:
        if args.count(num) == 1:
          sums += num
      return sums
