#include <stdio.h>
#include <stdlib.h>
#include <time.h

int main)(){
  int i,a;

  srand((unsigned)time(NULL));

  for(i=0;i<10000;i++){
    a=(int)((rand()/((double)RAND_MAX+1.0))*10000.0);
    printf("%d\n",a);
  }
  return 0;
}