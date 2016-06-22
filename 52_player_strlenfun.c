#include <stdio.h>

int main()
{
   int n,len;
    scanf("%d",&n);
    char str[n];
    scanf("%[^\n]s",str);
    /*To find length*/
    len=strlen(str);
    printf("The entered string is %s",str);
    printf("The length is %d",len);
    return 0;
}
