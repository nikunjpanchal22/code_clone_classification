private string GenerateSequence (int num) {
    string str = "";
    char achar;
    int mod;
    while (true) {
        mod = (num % 26) + 65;
        num = (int) (num / 26);
        achar = (char) mod;
        str = achar + str;
        if (num > 0)
            num --;
        else if (num == 0)
            break;
    }
    return str;
}


   private string GenerateSequence(int num)
     {
         StringBuilder str = new StringBuilder(string.Empty);
         int mod;

         while (true)
         {
             mod = (num % 26) + 65;
             num = (int)(num / 26);
             str.Insert(0, Convert.ToChar(mod));

             if (num > 0)
                 num--;
             else if (num == 0)
                 break;
         }

         return str.ToString();
     }

  private string GenerateSequence(int num)
    {
        List<char> charList = new List<char>();

        while (true)
        {
            int mod = (num % 26) + 65;
            num = (int) (num / 26);
            charList.Insert(0, (char) mod);

            if (num > 0)
                num--;
            else if (num == 0)
                break;
        }

        return string.Join("", charList);
    }

  private string GenerateSequence(int num)
    {
        string str = "";
        char achar;
        int mod;

        while (true)
        {
            mod = (num % 26) + 65;
            num = (int)(num / 26);
            achar = Convert.ToChar(mod);
            str = achar + str;

            if (num > 0)
                num--;
            else if (num == 0)
                break;
        }

        return str;
    }

  private string GenerateSequence(int num)
    {
        StringBuilder sb = new StringBuilder();
        int mod;

        while (true)
        {
            mod = (num % 26) + 65;
            num = (int)(num / 26);
            sb.Insert(0, (char) mod);

            if (num > 0)
                num--;
            else if (num == 0)
                break;
        }

        return sb.ToString();
    }

  private string GenerateSequence(int num)
    {
        StringBuilder sb = new StringBuilder();
        int mod;

        do
        {
            mod = (num % 26) + 65;
            num = (int)(num / 26);
            sb.Insert(0, (char) mod);

            if (num > 0)
                num--;
        } while (num != 0);

        return sb.ToString();
    }

  private string GenerateSequence(int num)
    {
        string str = "";
        int mod;

        while (true)
        {
            mod = (num % 26) + 65;
            num = (int)(num / 26);
            str = Convert.ToChar(mod) + str;

            if (num > 0)
                num--;
            else if (num == 0)
                break;
        }

        return str;
    }

  private string GenerateSequence(int num)
    {
        Stack<char> charStack = new Stack<char>();
        int mod;

        while (true)
        {
            mod = (num % 26) + 65;
            num = (int)(num / 26);
            charStack.Push(Convert.ToChar(mod));

            if (num > 0)
                num--;
            else if (num == 0)
                break;
        }

        return new string(charStack.ToArray());
    }

  private string GenerateSequence(int num)
    {
        Stack<char> charStack = new Stack<char>();
        int mod;

        do
        {
            mod = (num % 26) + 65;
            num = (int)(num / 26);
            charStack.Push(Convert.ToChar(mod));

            if (num > 0)
                num--;
        } while (num != 0);

        return new string(charStack.ToArray());
    }

 private string GenerateSequence(int num)
 {
     List<char> charList = new List<char>();
     int mod;

    do
    {
        mod = (num % 26) + 65;
        num = (int) (num / 26);
        charList.Insert(0, Convert.ToChar(mod));

        if (num > 0)
            num--;
    } while (num != 0);

    return string.Join("", charList);
}
