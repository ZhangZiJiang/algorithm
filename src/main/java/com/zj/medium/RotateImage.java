package com.zj.medium;

/**
 * @author zhangbo
 * @program: algorithm
 * @description: 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 * <p>
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[[7,4,1],[8,5,2],[9,6,3]]
 * 示例 2：
 * <p>
 * <p>
 * 输入：matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
 * 输出：[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 * 示例 3：
 * <p>
 * 输入：matrix = [[1]]
 * 输出：[[1]]
 * 示例 4：
 * <p>
 * 输入：matrix = [[1,2],[3,4]]
 * 输出：[[3,1],[4,2]]
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-image
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021-03-06 14:25:35
 */
public class RotateImage {
    public static void main(String[] args) {
        Solution solution = new RotateImage().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void rotate(int[][] matrix) {
            int abs1 = 0;
            int abs2 = matrix.length - 1;
            int times = 0;
            while (abs1 <= abs2) {
                int p1 = abs1;
                int p2 = abs2;
                while (p1 != abs2) {
                    int temp = matrix[abs1][p1];        //左上
                    matrix[abs1][p1] = matrix[p2][abs1];//左上 = 左下
                    matrix[p2][abs1] = matrix[abs2][p2];//左下 = 右下
                    matrix[abs2][p2] = matrix[p1][abs2];//右下 = 右上
                    matrix[p1][abs2] = temp;            //右上 = 左上
                    p1 += 1;
                    p2 -= 1;
                }
                abs1 += 1;
                abs2 -= 1;
            }
        }

        /**
         * 递归吧
         *
         * @param matrix
         */
        private void helper(int[][] matrix, int left, int right) {
            if (matrix.length >= 2) {
                int n = matrix.length;
                int l = left;
                int r = right;


                for (int i = 0; i < n - 1; i++) {
                    int temp;

                }
            }


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
