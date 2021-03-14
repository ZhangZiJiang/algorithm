package com.zj.easy;

/**
 * @program algorithm
 * @description: 303. 区域和检索 - 数组不可变
 * 给定一个整数数组  nums，求出数组从索引 i 到 j（i ≤ j）范围内元素的总和，包含 i、j 两点。
 *
 * 实现 NumArray 类：
 *
 * NumArray(int[] nums) 使用数组 nums 初始化对象
 * int sumRange(int i, int j) 返回数组 nums 从索引 i 到 j（i ≤ j）范围内元素的总和，包含 i、j 两点（也就是 sum(nums[i], nums[i + 1], ... , nums[j])）
 *  
 *
 * 示例：
 *
 * 输入：
 * ["NumArray", "sumRange", "sumRange", "sumRange"]
 * [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
 * 输出：
 * [null, 1, -1, -3]
 *
 * 解释：
 * NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
 * numArray.sumRange(0, 2); // return 1 ((-2) + 0 + 3)
 * numArray.sumRange(2, 5); // return -1 (3 + (-5) + 2 + (-1))
 * numArray.sumRange(0, 5); // return -3 ((-2) + 0 + 3 + (-5) + 2 + (-1))
 *  
 *
 * 提示：
 *
 * 0 <= nums.length <= 104
 * -105 <= nums[i] <= 105
 * 0 <= i <= j < nums.length
 * 最多调用 104 次 sumRange 方法
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/range-sum-query-immutable
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: zhangbo
 * @create: 2021/03/14 23:13
 */
public class RangeSumQueryImmutable {
    public static void main(String[] args) {
        NumArray solution = new RangeSumQueryImmutable().new NumArray(new int[2]);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class NumArray {

        private int[] arr;

        public NumArray(int[] nums) {
            arr = new int[nums.length];
            if (nums.length == 0) {
                return;
            }
            arr[0] = nums[0];
            //使用arr[] 将nums[i] 前相加存储在arr[i]中
            for (int i = 1; i < nums.length; i++) {
                arr[i] += arr[i - 1] + nums[i];
            }
        }

        //通过这种方式调用
        public int sumRange(int left, int right) {
            if (left == 0) {
                return arr[right];
            } else {
                return arr[right] - arr[left - 1];
            }
        }
    }


}