static int CharToValue (char c) {
    char cl = char.ToLower (c);
    if (cl == 'a')
        return 0;
    if (cl == 'b')
        return 1;
    if (cl == 'c')
        return 2;
    if (cl == 'd')
        return 3;
    if (cl == 'e')
        return 4;
    if (cl == 'f')
        return 5;
    if (cl == 'g')
        return 6;
    if (cl == 'h')
        return 7;
    if (cl == 'i')
        return 8;
    if (cl == 'j')
        return 9;
    if (cl == 'k')
        return 10;
    if (cl == 'l')
        return 11;
    if (cl == 'm')
        return 12;
    if (cl == 'n')
        return 13;
    if (cl == 'o')
        return 14;
    if (cl == 'p')
        return 15;
    if (cl == 'q')
        return 16;
    if (cl == 'r')
        return 17;
    if (cl == 's')
        return 18;
    if (cl == 't')
        return 19;
    if (cl == 'u')
        return 20;
    if (cl == 'v')
        return 21;
    if (cl == 'w')
        return 22;
    if (cl == 'x')
        return 23;
    if (cl == 'y')
        return 24;
    if (cl == 'z')
        return 25;
    if (cl == '2')
        return 26;
    if (cl == '3')
        return 27;
    if (cl == '4')
        return 28;
    if (cl == '5')
        return 29;
    if (cl == '6')
        return 30;
    if (cl == '7')
        return 31;
    throw new Exception ("Not a base32 string");
}



static int CharToValue(char c)
{
    char cl = char.ToLower(c);

    Dictionary<char, int> dictLookup = new Dictionary<char, int>();
    dictLookup.Add('a', 0);
    dictLookup.Add('b', 1);
    dictLookup.Add('c', 2);
    dictLookup.Add('d', 3);
    dictLookup.Add('e', 4);
    dictLookup.Add('f', 5);
    dictLookup.Add('g', 6);
    dictLookup.Add('h', 7);
    dictLookup.Add('i', 8);
    dictLookup.Add('j', 9);
    dictLookup.Add('k', 10);
    dictLookup.Add('l', 11);
    dictLookup.Add('m', 12);
    dictLookup.Add('n', 13);
    dictLookup.Add('o', 14);
    dictLookup.Add('p', 15);
    dictLookup.Add('q', 16);
    dictLookup.Add('r', 17);
    dictLookup.Add('s', 18);
    dictLookup.Add('t', 19);
    dictLookup.Add('u', 20);
    dictLookup.Add('v', 21);
    dictLookup.Add('w', 22);
    dictLookup.Add('x', 23);
    dictLookup.Add('y', 24);
    dictLookup.Add('z', 25);
    dictLookup.Add('2', 26);
    dictLookup.Add('3', 27);
    dictLookup.Add('4', 28);
    dictLookup.Add('5', 29);
    dictLookup.Add('6', 30);
    dictLookup.Add('7', 31);

    if (dictLookup.ContainsKey(cl))
    {
        return dictLookup[cl];
    }
    else
    {
        throw new Exception("Not a base32 string");
    }
}


