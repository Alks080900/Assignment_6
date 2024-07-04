package Assignment_6_Problem1;

public class MyTable {
    private Entry[] entries;

    public MyTable() {
        entries = new Entry[26];
    }

    public String get(char c) {
        int index = c - 'a';
        if (entries[index] != null) {
            return entries[index].str;
        }
        return null;
    }

    public void add(char c, String s) {
        int index = c - 'a';
        entries[index] = new Entry(c, s);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Entry entry : entries) {
            if (entry != null) {
                sb.append(entry.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    private class Entry {
        char ch;
        String str;

        Entry(char ch, String str) {
            this.ch = ch;
            this.str = str;
        }

        public String toString() {
            return ch + "->" + str;
        }
    }
}
