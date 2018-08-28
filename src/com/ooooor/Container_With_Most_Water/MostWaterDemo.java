package com.ooooor.Container_With_Most_Water;

/**
 * @description: 每条边对应最大值,和 长度/边高度有关
 * @author: chenr
 * @date: 18-8-28
 */
public class MostWaterDemo {

    /*public int maxArea(int[] height) {

        int result = 0;
        int length = height.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {

                if (height[i] <= height[j]) {

                    int temp = height[i] * Math.abs(j - i);
                    if (result < temp) {
                        result = temp;
                    }
                }

            }
        }
        return result;
    }*/

    public int maxArea(int[] height) {
        int result = 0;
        int min = 0;
        int max = height.length - 1;
        while (max > min) {
            result = Math.max(Math.min(height[max], height[min]) * (max - min), result);
            if (height[min] >= height[max]) {
                max--;
            } else {
                min++;
            }
        }
        return result;
    }
}
