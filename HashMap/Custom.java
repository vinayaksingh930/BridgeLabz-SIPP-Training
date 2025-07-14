class MyHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;
    
    private Entry<K, V>[] buckets;
    private int size;
    private float loadFactor;
    
    // Node class for linked list
    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;
        
        Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
    
    // Constructor
    @SuppressWarnings("unchecked")
    public MyHashMap() {
        buckets = new Entry[DEFAULT_CAPACITY];
        size = 0;
        loadFactor = DEFAULT_LOAD_FACTOR;
    }
    
    // Hash function
    private int getBucketIndex(K key) {
        return key == null ? 0 : Math.abs(key.hashCode() % buckets.length);
    }
    
    // Insert or update value
    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        Entry<K, V> head = buckets[bucketIndex];
        
        // Check if key already exists
        Entry<K, V> current = head;
        while (current != null) {
            if ((key == null && current.key == null) || 
                (key != null && key.equals(current.key))) {
                current.value = value;
                return;
            }
            current = current.next;
        }
        
        // If key doesn't exist, add new entry at head
        Entry<K, V> newEntry = new Entry<>(key, value);
        newEntry.next = head;
        buckets[bucketIndex] = newEntry;
        size++;
        
        // Check if rehashing is needed
        if ((float) size / buckets.length > loadFactor) {
            rehash();
        }
    }
    
    // Retrieve value by key
    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        Entry<K, V> current = buckets[bucketIndex];
        
        while (current != null) {
            if ((key == null && current.key == null) || 
                (key != null && key.equals(current.key))) {
                return current.value;
            }
            current = current.next;
        }
        
        return null;
    }
    
    // Remove entry by key
    public void remove(K key) {
        int bucketIndex = getBucketIndex(key);
        Entry<K, V> head = buckets[bucketIndex];
        
        // If bucket is empty
        if (head == null) {
            return;
        }
        
        // If head is the target
        if ((key == null && head.key == null) || 
            (key != null && key.equals(head.key))) {
            buckets[bucketIndex] = head.next;
            size--;
            return;
        }
        
        // Search for the key in linked list
        Entry<K, V> prev = head;
        Entry<K, V> current = head.next;
        
        while (current != null) {
            if ((key == null && current.key == null) || 
                (key != null && key.equals(current.key))) {
                prev.next = current.next;
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }
    
    // Get size
    public int size() {
        return size;
    }
    
    // Check if empty
    public boolean isEmpty() {
        return size == 0;
    }
    
    // Rehash the map when load factor is exceeded
    @SuppressWarnings("unchecked")
    private void rehash() {
        Entry<K, V>[] oldBuckets = buckets;
        buckets = new Entry[oldBuckets.length * 2];
        size = 0;
        
        for (Entry<K, V> head : oldBuckets) {
            Entry<K, V> current = head;
            while (current != null) {
                put(current.key, current.value);
                current = current.next;
            }
        }
    }
}

// Test the implementation
class Custom {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        System.out.println("Value for key 'one': " + map.get("one")); // Output: 1
        System.out.println("Value for key 'two': " + map.get("two")); // Output: 2
        
        map.remove("two");
        System.out.println("After removing 'two', value: " + map.get("two")); // Output: null
        
        map.put("one", 100);
        System.out.println("After updating 'one', value: " + map.get("one")); // Output: 100
    }
}