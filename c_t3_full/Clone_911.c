int main () {
    const char *key1 = "keynumber1";
    uint32_t match = jenkins_one_at_a_time_hash (key1, strlen (key1));
    printf ("Target 0x%lX\n", (unsigned long) match);
    uint32_t i = 0;
    do {
        uint32_t hash = jenkins_one_at_a_time_hash (&i, sizeof i);
        if (hash == match) {
            printf ("0x%lX: 0x%lX\n", (unsigned long) i, (unsigned long) hash);
            fflush (stdout);
        }
    }
    while (++i);
    const char *key2 = "\x3C\xA0\x94\xB9";
    uint32_t match2 = jenkins_one_at_a_time_hash (key2, strlen (key2));
    printf ("Match 0x%lX\n", (unsigned long) match2);
}


 
int main()
{
    const char *key1 = "keynumber1";
    uint32_t match = jenkins_one_at_a_time_hash(key1, strlen(key1));
    printf("Target 0x%lX\n", (unsigned long) match);
    
    uint32_t max = UINT32_MAX;
    uint32_t min = 0;
    while (min <= max)
    {
    	uint32_t middle = min + ((max - min) / 2);
    	uint32_t hash = jenkins_one_at_a_time_hash(&middle, sizeof(middle));
    	if (hash == match) 
    	{
    		printf("0x%lX: 0x%lX\n", (unsigned long)middle, (unsigned long)hash);
            fflush(stdout);
            break;
        }
        else if (hash < match)
        {
    		min = middle + 1;
        }
        else 
        {
            max = middle - 1;
        }
    }

    const char *key2 = "\x3C\xA0\x94\xB9";
    uint32_t match2 = jenkins_one_at_a_time_hash(key2, strlen(key2));
    printf("Match 0x%lX\n", (unsigned long) match2);
}


