class Solution {
    public int maxArea(int[] height) {
        int max=0,small=0,k;
        
        
        for (int i=0; i<height.length-1; i++)
        {
            for (int j=1; j<height.length; j++)
            {  if(height[i]<height[j])
                {    small=height[i];
                      k=j-i;
                }
                else
                {
                    small=height[j];
                    k=i-j;
                }
                if (k<=0)
                    k*=-1;
                if (max<small*k & i!=j)
                    max=small*k;
               
            }
        }
        
        return max;
    }
}
