// O(m+n) Time
// O(1) Space
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // if(nums1.length == 0) return;
        // if(nums2.length == 0) nums1 = nums2;
      
      // [1 2l 3f 3 5 6] , [2r 5 6]
      
      // lf [1 2],  r [1]
      
        int left = m-1;
        int  right = n-1;
        int filler = m+n-1;
      
      while(filler >= 0){ // y
        
        if(left < 0 || right < 0){
          break;
        }
        
        if(nums1[left] >= nums2[right]){
          nums1[filler] = nums1[left];
          filler--;
          left--;
        }
        else if(nums1[left] <= nums2[right]){
          nums1[filler] = nums2[right];
          filler--;
          right--;
        }
      }
      
      while(left >= 0){
        nums1[filler] = nums1[left];
        left--;
        filler--;
      }
      
      while(right >= 0){
        nums1[filler] = nums2[right];
        right--;
        filler--;
      }
    }
}
