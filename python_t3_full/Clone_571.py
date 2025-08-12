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
    prev_val, curr_val = 1, 1
    for x in num_str:
      prev_val *= curr_val
      curr_val = int(x)
      num_str = str(prev_val * curr_val)
    count += 1
  return count


