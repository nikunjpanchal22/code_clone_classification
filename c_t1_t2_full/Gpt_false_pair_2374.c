int main (int argc, char **argv) {
    int i;
    char *input_string =;
    char **tokens;
    int tokens_count = 0;
    char *input_ptr = input_string;
    char *tmp_token;
    size_t tmp_token_length;
    for (; input_ptr[tokens_count]; input_ptr[tokens_count] == ',' ? tokens_count++ : input_ptr++)
        ;
    if (tokens_count == 0) {
    }
    else {
        tokens = malloc (sizeof (*tokens) * tokens_count);
        i = 0;
        tmp_token = strtok (input_string, ',');
        while (tmp_token != NULL) {
            tmp_token_length = strlen (tmp_token);
            if (tmp_token_length != 0) {
                tokens[i] = malloc (tmp_token_length);
                strcpy (tokens [i], tmp_token);
            }
            else {
                tokens[i] = NULL;
            }
            i++;
            tmp_token = strtok (input_string, ',');
        }
        long **m = malloc (sizeof (long *) * tokens_count);
        for (i = 0; i < tokens_count; i++) {
            char *tmp_token = tokens[i];
            if (tmp_token == NULL) {
                m[i] = NULL;
            }
            else {
                m[i] = malloc (sizeof (long));
                m[i][0] = strtol (tmp_token, NULL, 10);
            }
        }
    }
}


int main (int argc, char **argv) {
    int i;
    char *input_string =;
    char **tokens;
    int tokens_count = 0;
    char *input_ptr = input_string;
    char *tmp_token;
    size_t tmp_token_length;
    for (; input_ptr[tokens_count]; input_ptr[tokens_count] == ':' ? tokens_count++ : input_ptr++)
        ;
    if (tokens_count == 0) {
    }
    else {
        tokens = malloc (sizeof (*tokens) * tokens_count);
        i = 0;
        tmp_token = strtok (input_string, ':');
        while (tmp_token != NULL) {
            tmp_token_length = strlen (tmp_token);
            if (tmp_token_length != 0) {
                tokens[i] = malloc (tmp_token_length);
                strcpy (tokens [i], tmp_token);
            }
            else {
                tokens[i] = NULL;
            }
            i++;
            tmp_token = strtok (input_string, ':');
        }
        float **m = malloc (sizeof (float *) * tokens_count);
        for (i = 0; i < tokens_count; i++) {
            char *tmp_token = tokens[i];
            if (tmp_token == NULL) {
                m[i] = NULL;
            }
            else {
                m[i] = malloc (sizeof (float));
                m[i][0] = strtof (tmp_token, NULL, 10);
            }
        }
    }
}
