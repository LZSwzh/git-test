public class Solution {
    public static void main(String[] args) {
        int i = strStr("abbcd", "bc");
        /**
         * 这里添加注释的原因是想要测试git的切换版本，这一版代码没做修改，仅仅是添加了这个注释
         */
        System.out.println(i);
    }
    public static int strStr(String haystack, String needle) {
        if(needle==null) return -1;
        if(needle.equals("")) return 0;
        //第一层循环，用于迭代haystack
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            //第二次循环,用于迭代needle(条件是haystack中的字符等于needle的第一个字符)
            if(haystack.charAt(i)==needle.charAt(0)){
                for(int j=0;j<needle.length();j++){//多一个但是迭代不到
                    if(haystack.charAt(i+j)!=needle.charAt(j)){
                        break;
                    }
                    if(j==needle.length()-1 && haystack.charAt(i+j)==needle.charAt(j)){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
