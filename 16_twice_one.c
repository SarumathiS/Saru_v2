#include<stdio.h>
int main()
{
int B[] = {2,1,4,5,1,4,2,2,4,1},i;
int ones = 0 ;
int twos = 0 ;
int not_threes, x ;

for( i=0; i< 10; i++ )
{
x = B[i];
twos |= ones & x ;
ones ^= x ;
not_threes = ~(ones & twos) ;
ones &= not_threes ;
twos &= not_threes ;
}

printf("\n unique element = %d \n", ones );
return 0;
} 
