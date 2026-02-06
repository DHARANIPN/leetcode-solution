// Last updated: 2/6/2026, 10:46:03 AM
class Solution {
    public String defangIPaddr(String address) {
        String d = address.replace(".","[.]");
        return d;
    }
}