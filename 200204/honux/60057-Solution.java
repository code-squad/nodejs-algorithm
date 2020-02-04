//programmers 60057 카카오 공채 문자열 압축
//어렵진 않은데 시간이 오래 걸렸다.

import java.util.List;
import java.util.ArrayList;

class Solution {
    
    private List<String> cutString(String origin, int size) {
        List<String> ret = new ArrayList<>();
        for (int i = 0; i < origin.length(); i += size) {
            int e = (i + size) > origin.length() ? origin.length(): i + size;
            String str = origin.substring(i, e);
            ret.add(str);
        }
        return ret;
    }

    private String findCompressString(String str, int size) {
        List<String> slist = cutString(str, size);

        int count = 0;
        StringBuffer newStr = new StringBuffer();

        String prev = slist.get(0);
        newStr.append(prev);
        int repeat = 1;
        for (int i = 1; i < slist.size(); i++) {
            String curr = slist.get(i);
            if(curr.equals(prev)) {
                repeat++;
            } else {
                if (repeat != 1) {
                    newStr.append(Integer.toString(repeat));
                    repeat = 1;
                }
                newStr.append(curr);
                prev = curr;
            }
        }

        if (repeat != 1) {
            newStr.append(Integer.toString(repeat));
        }
        return newStr.toString();
    }
    
    public int solution(String s) {
       int ans = s.length();
        for(int i = 1; i < s.length(); i++) {
            ans = Math.min(ans, findCompressString(s, i).length());
        }
        return ans;
    }
}

