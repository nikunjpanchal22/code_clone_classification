def persistence(num) :
  num_str = str(num)
  count = 0
  while len(num_str) > 1:
    curr_num = 1
    for c in num_str:
        curr_num *= int(c)
    num_str = str(curr_num)
    count += 1
  return count


 def persistence(num):
  num_str = str(num)
  count = 0
  while len(num_str) > 1:
    curr_num = 1
    mul = list(num_str)
    for x in mul:
      curr_num *= int(x)
    num_str = str(curr_num)
    count += 1
  return count
