/* C++ Program to find the maximum element in each column of a matrix */
#include<iostream>
#include<limits.h>

using namespace std;

int main()
{
    int i, j, k;
  int m,n;
  cin >> m;
  cin >> n;
  
    int mat1[m][n];
  int output[n];
  for(i=0;i<m;i++) {
    for (j=0;j<n;j++) {
      cin >> mat1[i][j];
    }
  }
 
   for(j=0;j<n;j++){
     for(i=1;i<m;i++){
       if(mat1[i-1][j]<mat1[i][j])
         output[j]=mat1[i][j];
     }
   }
  
  for(i=0;i<n;i++){
    cout << output[i] <<endl;
  }
  
  
   
    return 0;
}