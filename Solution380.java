import java.util.*;

public class Solution380 {
    List<Integer> list;
    Map<Integer, Integer> map;
    private Random rn;

    public RandomizedSet() {
        this.list = new ArrayList<>();
        this.map = new HashMap<>();
               this.rn = new Random();

    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int index = map.remove(val);
        int lastitem = list.remove(list.size() - 1);
        if (lastitem != val) {
            list.set(index, lastitem);
            map.put(lastitem, index);
        }
        return true;

    }

    public int getRandom() {
        int randomIdx = rn.nextInt(list.size());
        return list.get(randomIdx);
    }
}
