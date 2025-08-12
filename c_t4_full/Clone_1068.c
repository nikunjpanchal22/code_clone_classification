int main () {
    char input [] = "v=0 o=sip_user IN 10230 22472 IP4 10.10.10.44 s=SIP_CALL c=IN IP4 10.10.10.44 m=audio 49152 RTP/AVP 0 8 a=rtpmap:0 PCMU/8000 a=rtpmap:8 PCMA/8000";
    char *parts [16] = {0};
    int top = 0;
    int i;
    char *s = input;
    while (top < 15 && (s = strchr (s, '='))) {
        parts[top++] = s - 1;
        s++;
    }
    for (i = 1; parts[i]; i++)
        parts[i][-1] = '\0';
    for (i = 0; parts[i]; i++)
        printf ("%s\n", parts[i]);
    return 0;
}





#include<string.h>
#include<stdio.h>

int main () {
	    char input[] = "v=0 o=sip_user IN 10230 22472 IP4 10.10.10.44 s=SIP_CALL c=IN IP4 10.10.10.44 m=audio 49152 RTP/AVP 0 8 a=rtpmap:0 PCMU/8000 a=rtpmap:8 PCMA/8000";
	    char *parts[16] = {0};
	    char *s = input;
	    int top;
	    for (top = 0; top < 15 && (s = strchr (s, '=')); top++, s++)
		parts[top] = s - 1;
	    int i;
	    for (i = 1; parts[i]; parts[i][-1] = '\0', i++);
	    for (i = 0; parts[i]; printf ("%s\n", parts[i]), i++);
	    return 0;
}


