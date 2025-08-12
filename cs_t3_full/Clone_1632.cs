private static IEnumerable < int > Approximations (IEnumerable < int > values, int target) {
    int sum = 0;
    bool first = true;
    foreach (var item in values) {
        if (sum + item < target || first) {
            first = false;
            sum += item;
        } else {
            if (sum + item - target < target - sum) {
                yield return sum + item;
                sum = 0;
                first = true;
            } else {
                yield return sum;
                sum = item;
            }
        }
    }
    if (first)
        yield break;
    yield return sum;
}


  private static IEnumerable<int> Approximations(IEnumerable<int> values, int target)
{
    int sum = 0;
    bool first = true;
    foreach (var item in values)
    {
        if (sum + item > target)
        {
     
            if (sum + item - target < target - sum)
            {
                yield return sum + item;
                sum = 0;
                first = true;
            }
            else
            {
                yield return sum;
                sum = item;
            }
        }
        else
        {
            first = false;
            sum += item;
        }
    }
    if(!first)
        yield return sum;
}


