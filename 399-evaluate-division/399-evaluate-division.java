class Item {
	public String name;
	public Double cost;

	public Item(String n, Double c) {
		this.name = n;
		this.cost = c;
	}
}

class Solution {
	Map<String, List<String>> graph = new HashMap<>();
	Map<String, List<Double>> costs = new HashMap<>();

	public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
		int n = equations.size();

		for(int i = 0; i < n; i++) {
			String a = equations.get(i).get(0);
			String b = equations.get(i).get(1);
			double forward = values[i];
			double backward = 1.0 / forward;

			if(!this.graph.containsKey(a)) {
				this.graph.put(a, new ArrayList<>());
				this.costs.put(a, new ArrayList<>());
			}

			this.graph.get(a).add(b);
			this.costs.get(a).add(forward);

			if(!this.graph.containsKey(b)) {
				this.graph.put(b, new ArrayList<>());
				this.costs.put(b, new ArrayList<>());
			}

			this.graph.get(b).add(a);
			this.costs.get(b).add(backward);
		}

		double[] result = new double[queries.size()];

		for(int i = 0; i < queries.size(); i++) {
			List<String> query = queries.get(i);
			result[i] = bfs(query.get(0), query.get(1));
		}

		return result;
	}

	public double bfs(String source, String destination) {
		Set<String> visited = new HashSet<>();
		Queue<Item> queue = new LinkedList<>();

		if(!this.graph.containsKey(source) || !this.graph.containsKey(destination)) return -1.0;

		queue.add(new Item(source, 1.0));
		visited.add(source);

		while(!queue.isEmpty()) {
			Item item = queue.poll();
			String current = item.name;
			Double currentCost = item.cost;

			if(current.equals(destination)) return currentCost;

			List<String> adjacents = this.graph.getOrDefault(current, new ArrayList<>());
			List<Double> adjacentCosts = this.costs.getOrDefault(current, new ArrayList<>());

			for(int i = 0; i < adjacents.size(); i++) {
				String next = adjacents.get(i);
				Double nextCost = adjacentCosts.get(i);

				if(visited.contains(next)) continue;

				queue.add(new Item(next, currentCost * nextCost));
				visited.add(next);
			}
		}

		return -1.0;
	}
}