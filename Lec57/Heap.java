package Lec57;

import java.util.ArrayList;

public class Heap {

	private ArrayList<Integer> list = new ArrayList<>();

	public void add(int item) {
		list.add(item);
		upheapify(this.list.size() - 1);
	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if (this.list.get(pi) > this.list.get(ci)) {
			this.swap(pi, ci);
			upheapify(pi);

		}

	}

	public int remove() {
		int rv = this.list.get(0);
		swap(0, this.list.size() - 1);
		this.list.remove(this.list.size() - 1);
		downheapify(0);
		return rv;

	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int mini = pi;
		int li = 2 * pi + 1;
		int ri = 2 * pi + 2;
		if (li < this.list.size() && this.list.get(li) < this.list.get(mini)) {
			mini = li;
		}
		if (ri < this.list.size() && this.list.get(ri) < this.list.get(mini)) {
			mini = ri;
		}
		if (mini != pi) {
			swap(mini, pi);
			downheapify(mini);
		}
	}

	public int get() {
		return this.list.get(0);
	}

	public int size() {
		return this.list.size();
	}

	private void swap(int i, int j) {
		int ith = this.list.get(i);
		int jth = this.list.get(j);
		this.list.set(i, jth);// update ith index
		this.list.set(j, ith);// update jth index

	}

	public void display() {
		System.out.println(this.list);
	}

}
