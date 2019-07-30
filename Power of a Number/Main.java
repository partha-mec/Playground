#include <stdio.h>
int main()
{
int base,exponent;
int result;
scanf("%d%d",&base,&exponent);
if(exponent>=0)
{
result=pow(base,exponent);
printf("%d",result);
}
else
{
printf("Wrong input");
}
return 0;
      }