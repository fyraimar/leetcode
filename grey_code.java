import java.util.List;
import java.util.LinkedList;

public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ret = new LinkedList<Integer>();

        for (int i = 0; i < Math.pow(2,n); i++) {
            int m = i >> 1;
            int res = m ^ i;
            ret.add(res);
        }

        return ret;
    }
}
