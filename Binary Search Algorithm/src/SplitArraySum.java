public class SplitArraySum {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;

        System.out.println(splitArray(nums, k));
    }

    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for(int num: nums) {
            start = Math.max(start, num); //to get the maximum number in the array in start
            end += num; //to the sum of all elements in the array in end
        }

        //binay search
        //we are not putting start == end == mid because at this point, we shall get out answer, terminating condition
        while(start < end) {
            int mid = start + (end - start)/2;

            //calculate how many pieces to divide the array as per the mid
            int sum = 0;
            int pieces = 1; //because once array gets split, pieces would be two only. hence can't start with 0

            for(int num: nums) {
                if(sum + num > mid) {
                    //create a new subarray
                    sum = num; //next subarray would have this right
                    pieces++;
                }
                else {
                    //add in exising subarray
                    sum += num;
                }
            }

            if(pieces <= k)
                end = mid;
            else
                start = mid + 1;
        }

        //can return start, mid or end, they all shall be same
        return end;
    }
}
