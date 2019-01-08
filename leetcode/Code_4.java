package test.leetcode;

public class Code_4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        if(nums1.length == 0 && nums2.length == 0){
            return result;
        }
        if(nums2.length == 0){
            int length = nums1.length;
            result = (length-1)/2 == 0? nums1[(length-1)/2]:(nums1[(length-1)/2]+nums1[(length-1)/2+1])/2;
            return result;
        }
        if(nums1.length ==0 ){
            int length = nums2.length;
            result = (length-1)/2 == 0? nums2[(length-1)/2]:(nums2[(length-1)/2]+nums2[(length-1)/2+1])/2;
            return result;
        }
        int length1 = nums1.length;
        int length2 = nums2.length;
        if(nums1[length1-1] < nums2[0]){
            result = (length1+length2-2) /2;
            if(result == 0){
                result = (length1-1)>result?nums1[(int)result+1]:nums2[(int) (result - length1+1)];
            }else{
                result = (length1-1)>=result?nums1[(int)result-1]:nums2[(int) (result - length1+1)];
                result += (length1-1)>=((length1+length2-2)/2)?nums1[((length1+length2-2)/2-1)]:nums2[(((length1+length2-2)/2) - length1+1)];
                result = result/2;
            }
        }else if(nums2[length2-1] < nums1[0]){
            result = (length1+length2-2) /2;
            if(result == 0){
                result = (length2-1)>result?nums2[(int)result+1]:nums1[(int) (result - length2+1)];
            }else{
                result = (length2-1)>=result?nums2[(int)result-1]:nums1[(int) (result - length2+1)];
                result += (length2-1)>=((length1+length2-2)/2)?nums2[((length1+length2-2)/2-1)]:nums1[(((length1+length2-2)/2) - length2+1)];
                result = result/2;
            }
        }else{
            int middle = 0;
            int i =0,j=0;
            int cur = length1+length2 ;
            while (i<nums1.length || j<nums2.length){
                if (i<nums1.length && j<nums2.length){
                    if(nums1[i] > nums2[j]){
                        j++;
                        middle ++;
                    }else if(nums1[i] < nums2[j]){
                        i++;
                        middle++;
                    }else{
                        i++;
                        j++;
                        middle+=2;
                    }
                }else if(i<nums1.length){
                    i++;middle++;
                }else{
                    j++;middle++;
                }

                if(middle == cur/2){
                    if(cur %2 == 0){
                        result = i==middle? nums2[j-1]:nums1[i-1];
                        result += nums1[i] > nums2[j]?nums2[j]:nums1[i];
                        result = result/2;
                    }else{
                        result = i == middle-1 ? nums1[i]:nums2[j];
                    }
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{2};
        int[] array2 = new int[]{1,3,4};
        System.out.println(findMedianSortedArrays(array1,array2));
    }
}
