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
    total = 1
    for y in num_str:
      total *= int(y)
    num_str = str(total)
    count += 1
  return count
