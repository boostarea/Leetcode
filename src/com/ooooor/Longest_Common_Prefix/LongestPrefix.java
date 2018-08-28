package com.ooooor.Longest_Common_Prefix;

/**
 * @description: 匹配最大字符前缀 notes: no use toArray()
 * @author: chenr
 * @date: 18-8-28
 */
public class LongestPrefix {

   /* public static String longestCommonPrefix(String[] strs) {
        if (null == strs || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        int length = strs.length;

        for (int i = 0; i<length - 1; i++) {
            char[] after = strs[i + 1].toCharArray();
            char[] before = prefix.toCharArray();

            int minLen = Math.min(before.length, after.length);
            if (minLen == 0){
                return "";
            }

            for (int j=0; j<minLen; j++) {

                if (before[j] != after[j]) {
                    if (j==0) {
                        return "";
                    } else {
                        prefix = prefix.substring(0, j);
                        break;
                    }
                }
                if (j == minLen-1) {
                    prefix = prefix.substring(0, minLen);
                    break;
                }

            }

        }
        return prefix;
    }*/

    public static String longestCommonPrefix(String[] strs) {
        if (null == strs || strs.length == 0) {
            return "";
        }
        String result = strs[0];
        int length = strs.length;

        for (int i = 1; i<length; i++) {
            if ("".equals(result)) {
                break;
            }
            // 使用indexOf/substring Loop代替toArray比较
            while(strs[i].indexOf(result) != 0) {
                result = result.substring(0, result.length()-1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"ac", "ace", "acc"}));
    }
}
