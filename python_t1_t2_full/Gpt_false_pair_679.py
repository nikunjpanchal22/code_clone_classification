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
    prod = 1
    for i in num_str:
      prod *= int(i) 
    num_str = str(prod) 
    count += 1
  return count
