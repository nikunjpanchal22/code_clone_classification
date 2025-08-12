def lone_sum(* args) :
  result = 0
  for val in args :
    if args.count(val) == 1 :
      result += val
  return result


 def lone_sum(*args):
      A = 0
      for b in args:
        if args.count(b) == 1:
          A = A + b
      return A
