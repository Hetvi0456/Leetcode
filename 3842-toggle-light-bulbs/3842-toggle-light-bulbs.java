class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) 
    {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < bulbs.size(); i++) {

        int current = bulbs.get(i);
        int count = 0;

        for (int j = 0; j < bulbs.size(); j++) {
            if (bulbs.get(j).equals(current)) {
                count++;
            }
        }

        if (count % 2 != 0 && !result.contains(current)) {
            result.add(current);
        }
    }
    Collections.sort(result);
    return result;

    }
}