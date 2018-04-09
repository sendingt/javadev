package genericsExample;

public class OrderedPair<K, V> implements Pair<K, V> {

	private K key;
	private V value;

	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public static void main(String[] args) {
		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
		Pair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");
		OrderedPair<String, Integer> p11 = new OrderedPair<>("Even", 8);
		OrderedPair<String, String>  p22 = new OrderedPair<>("hellosdsdsd", "world");
		System.out.println(p1.getKey());
		System.out.println(p1.getValue());
		System.out.println(p22.getKey());
	}
}
