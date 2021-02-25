package com.github.gang;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testKMP(){
        assertEquals(kmp("abc", "a"),0);
        assertEquals(kmp("abc", "b"), 1);
        assertEquals(kmp("abc", "c"), 2);

        assertEquals(kmp("abcabc", "ab"), 0);
        assertEquals(kmp("abcdabc", "abc"), 0);
        assertEquals(kmp("abcabcd", "abcd"), 3);
        assertEquals(kmp("asdfasdfasdfabcabcdasdfasdfasdf", "abcabcd"), 12);
    }


    public int kmp( String target, String source){
        int[] next = makeArray(source);
        int offset = 0;
        int i = 0;
        for(; i + offset < target.length() && offset < source.length(); ){

            if(target.charAt(i + offset) == source.charAt(offset)){
                offset++;
            } else {
                if (offset == 0 || next[offset - 1]==0){
                    i++;
                } else {
                    i = i + next[offset-1];
                }
                offset = 0;
            }
        }
        if (offset == source.length()){
            return i;
        }

        return -1;
    }
    public int[] makeArray(String source){
        int[] result = new int[source.length()];
        int offset = 0;
        result[0] = 0;
        for (int i = 1; i < source.length(); i++){
            //如果相等，则更新数组+1
            if(source.charAt(i) == source.charAt(offset)){
                result[i] = result[i-1] + 1;
                offset++;
            } else {
                //如果不相等，则修改偏移为前一个的值，尝试匹配已经匹配的字段的下一个字符
                offset = result[i-1];
                result[i] = result[offset];
            }
        }

        return result;
    }
}