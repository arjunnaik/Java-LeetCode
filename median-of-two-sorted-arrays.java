class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int temp[]=new int[nums1.length+nums2.length];
        int i=0;
        for (int j:nums1)
            temp[i++]=j;
        for (int j:nums2)
            temp[i++]=j;
        Arrays.sort(temp);
   
        if (temp.length%2==0)
        {
            return (temp[temp.length/2-1]+temp[temp.length/2])/2.0;
        }
        return temp[temp.length/2];
    }
}
